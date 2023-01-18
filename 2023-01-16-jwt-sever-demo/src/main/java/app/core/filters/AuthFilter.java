package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
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
			chain.doFilter(request, response);
			return;
		}

		if (requestUri.contains("/api")) {
			// if user is here they try to access api and we need to check for a valid token
			String token = req.getHeader("Authorization");
			try {
				User user = this.jwtUtil.extractUser(token);
				System.out.println(user);
			} catch (Exception e) {
				System.out.println("invalid token");
			}

		}
		// 2. pass the request on OR block the request
		chain.doFilter(request, response);
		// 3. some more actions if needed

	}

}
