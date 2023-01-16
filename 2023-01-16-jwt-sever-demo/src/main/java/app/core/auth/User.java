package app.core.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// this would be an entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String username;
	private Role role;

	public enum Role {
		ADMIN, COMPANY, CUSTOMER;
	}

}
