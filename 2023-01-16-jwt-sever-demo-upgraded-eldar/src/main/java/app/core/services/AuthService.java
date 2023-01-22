package app.core.services;

import javax.security.auth.login.LoginException;
import javax.security.auth.message.AuthException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.User;
import app.core.repos.UserRepo;

@Service
@Transactional
public class AuthService {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserRepo userRepo;

	public String register(User user) throws LoginException {
		if (user.getUsername().length() < 3) {
			throw new AuthException("username must be at list of 3 characters");
		}

		user = this.userRepo.save(user);
		String token = this.jwtUtil.generateToken(user);
		return token;
	}

	public String login(UserCredentials userCredentials) throws LoginException {
		User user = this.userRepo.findByEmail(userCredentials.getEmail())
				.orElseThrow(() -> new AuthException("loging failed - user with email " + userCredentials.getEmail() + " not found"));
		if (!userCredentials.getPassword().equals(user.getPassword())) {
			throw new LoginException("loging failed - wrong password");
		}
		if (userCredentials.getRole()!=user.getRole()) {
			throw new LoginException("loging failed - wrong role");
		}
		return this.jwtUtil.generateToken(user);
	}

}
