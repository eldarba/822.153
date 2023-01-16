package app.core.auth;

import app.core.auth.User.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCredentials {

	private String email;
	private String password;
	private Role role;

}
