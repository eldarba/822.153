package app.core;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.SignatureException;

public class DemoJwt {

	public static void main(String[] args) {

		// get a JWT Builder
		JwtBuilder jwtBuilder = Jwts.builder();

		Instant now = Instant.now();
		Instant exp = now.plus(5, ChronoUnit.MINUTES);

		// 1. set a secret
		String secret = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		// 2. set an algorithm
		String alg = SignatureAlgorithm.HS256.getJcaName();
		// 3. create a key object
		Key key = new SecretKeySpec(Base64.getDecoder().decode(secret), alg);

//		Map<String, Object> map = new HashMap<>();
//		map.put("first name", "Eldar");
//		map.put("last name", "Bakshi");
//		map.put("number", 5);

		// create a JWT (token)
		String jwtEncoded = jwtBuilder

				// .setClaims(map)

				.setSubject("eldarba@gmail.com")

				.setIssuedAt(Date.from(now))

				.setExpiration(Date.from(exp))

				.claim("first name", "Eldar")

				.claim("last name", "Bakshi")

				// sign with a Key object and a signature algorithm
				.signWith(key)

				.compact();

		// print the token
		System.out.println(jwtEncoded);

		// decode the encoded jwt
		// create a parser
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();

		try {
			// decode the jws
			Jws<Claims> jwtDecoded = jwtParser.parseClaimsJws(jwtEncoded);
			System.out.println(jwtDecoded);
			System.out.println(jwtDecoded.getHeader());
			System.out.println(jwtDecoded.getBody());
			System.out.println(jwtDecoded.getSignature());

			// get a specific claim value by claim name:
			String firstName = jwtDecoded.getBody().get("first name", String.class);
			System.out.println(firstName);

			// expiration error
//			Jws<Claims> jwtDecoded = jwtParser.parseClaimsJws(
//					"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlbGRhcmJhQGdtYWlsLmNvbSIsImlhdCI6MTY3Mzg2MjU0MywiZXhwIjoxNjczODYyNTQ4LCJmaXJzdCBuYW1lIjoiRWxkYXIiLCJsYXN0IG5hbWUiOiJCYWtzaGkifQ.FWU-23aN53ijFR_N41SYSnD_8QDJt7b_W3QvK7xGH38");

			// signature error
//			Jws<Claims> jwtDecoded = jwtParser.parseClaimsJws(jwtEncoded + "123");

			// Jws<Claims> jwtDecoded = jwtParser.parseClaimsJws("abc");

		} catch (ExpiredJwtException e) {
			System.out.println("Error: token expired - " + e.getMessage());
		} catch (SignatureException e) {
			System.out.println("Error: token corrupted - " + e.getMessage());
		} catch (MalformedJwtException e) {
			System.out.println("Error: token bad format - " + e.getMessage());
		} catch (JwtException e) {
			System.out.println("Error: some other JWT error - " + e.getMessage());
		}

	}

}
