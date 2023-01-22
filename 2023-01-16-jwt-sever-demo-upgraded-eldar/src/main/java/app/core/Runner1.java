package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.auth.JwtUtil;
import app.core.entities.User;
import app.core.entities.User.Role;

//@Component
public class Runner1 implements CommandLineRunner {

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public void run(String... args) throws Exception {

		User user = new User(101, "aaa@mail", "123", "aaa", "bbb", "aaab", Role.COMPANY);
		String token = this.jwtUtil.generateToken(user);

		System.out.println(token);

		user = this.jwtUtil.extractUser(token);
		System.out.println(user);
	}

}
