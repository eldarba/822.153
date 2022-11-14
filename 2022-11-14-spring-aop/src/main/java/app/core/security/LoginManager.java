package app.core.security;

import org.springframework.stereotype.Component;

@Component
public class LoginManager {

	private boolean logged;
	private String password = "123";

	public boolean login(String password) {
		if (password.equals(this.password)) {
			logged = true;
		}
		return logged;
	}

	public boolean isLogged() {
		return logged;
	}

	public void logout() {
		this.logged = false;
	}

}
