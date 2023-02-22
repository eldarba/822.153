package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.entities.User;

public class AuthorizationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("=== Authorization filter started");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		// to handle pre-flight requests in case of cross-origin situations
		if (httpRequest.getMethod().equalsIgnoreCase("options")) {
			System.out.println("=== PREFLIGHT (Authorization filter)");
			chain.doFilter(request, response);
		} else {
			String requestUri = httpRequest.getRequestURI();
			User user = (User) httpRequest.getAttribute("user");
			System.out.println("=== Authorization filter - request uri: " + requestUri);

			if (requestUri.contains("/api/admin") && user.getRole() != User.Role.ADMIN) {
				httpResponse.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500"); // for CORS
				httpResponse.setHeader("WWW-Authenticate", "Bearer realm=\"ADMIN API\"");
				httpResponse.setHeader("Access-Control-Expose-Headers", "*");
				httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "Only Admin can access this zone!");
			} else if (requestUri.contains("/api/company") && user.getRole() != User.Role.COMPANY) {
				httpResponse.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500"); // for CORS
				httpResponse.setHeader("WWW-Authenticate", "Bearer realm=\"COMPANY API\"");
				httpResponse.setHeader("Access-Control-Expose-Headers", "*");
				httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "Only Company can access this zone!");
			} else if (requestUri.contains("/api/customer") && user.getRole() != User.Role.CUSTOMER) {
				httpResponse.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500"); // for CORS
				httpResponse.setHeader("WWW-Authenticate", "Bearer realm=\"CUSTOMER API\"");
				httpResponse.setHeader("Access-Control-Expose-Headers", "*");
				httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "Only Cusomer can access this zone!");
			} else {
				chain.doFilter(request, response);
			}
		}

		// 3. some more actions if needed
		System.out.println("=== Authorization filter is done");
	}

}
