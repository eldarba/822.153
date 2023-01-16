package app.core;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

public class DemoJwt {

	public static void main(String[] args) {

		// get a JWT Builder
		JwtBuilder jwtBuilder = Jwts.builder();

		// create a JWT (token)
		String jwt = jwtBuilder.compact();

		// print the token
		System.out.println(jwt);

	}

}
