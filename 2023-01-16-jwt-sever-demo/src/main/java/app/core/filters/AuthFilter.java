package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import app.core.auth.JwtUtil;
import app.core.entities.User;

@Component
@Order(1)
public class AuthFilter implements Filter {

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("this is filter 1");
		// 1. check the request
		// from the request object we get the value of the Authorization header
		HttpServletRequest req = (HttpServletRequest) request;

		// request info
		String requestUri = req.getRequestURI();
		System.out.println("request uri is: " + requestUri);

		String requestMethod = req.getMethod();
		System.out.println("request method: " + requestMethod);

		// to handle pre-flight requests in case of cross-origin situations
		if (requestMethod.equalsIgnoreCase("options")) {
			System.out.println("PREFLIGHT");
			chain.doFilter(request, response);
			return;
		}

		if (requestUri.contains("/api/app")) {
			// if user is here they try to access api and we need to check for a valid token
			String token = req.getHeader("Authorization");
			try {
				User user = this.jwtUtil.extractUser(token);
				System.out.println(user);
				// 2. pass the request on
				chain.doFilter(request, response);
			} catch (Exception e) {
				// 2. OR block the request
				System.out.println("invalid token: " + e.getMessage());
				HttpServletResponse resp = (HttpServletResponse) response;
				resp.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500"); // for CORS
				resp.sendError(HttpStatus.UNAUTHORIZED.value(), "You need to login - " + e.getMessage());
			}

		} else {
			// if we are here the user is not accessing api and can go on
			chain.doFilter(request, response);
		}

		// 3. some more actions if needed
		System.out.println("filter is done");
	}

}
