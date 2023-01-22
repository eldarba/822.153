package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import app.core.auth.JwtUtil;
import app.core.filters.AuthenticationFilter;
import app.core.filters.AuthorizationFilter;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	FilterRegistrationBean<AuthenticationFilter> autneticationFilter(JwtUtil jwtUtil){
		AuthenticationFilter authenticationFilter = new AuthenticationFilter(jwtUtil);
		FilterRegistrationBean<AuthenticationFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(authenticationFilter);
		registrationBean.addUrlPatterns("/api/*");
		registrationBean.setOrder(1);
		return registrationBean;
	}
	
	@Bean
	FilterRegistrationBean<AuthorizationFilter> authorizationFilter(){
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();
		FilterRegistrationBean<AuthorizationFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(authorizationFilter);
		registrationBean.addUrlPatterns("/api/admin/*", "/api/company/*", "/api/customer/*");
		registrationBean.setOrder(2);
		return registrationBean;
	}
	
	 @Bean
	    OpenAPI customOpenAPI() {
	        return new OpenAPI().info(new 
	             Info().title("title").version("version").description("description"))
	                .addSecurityItem(new SecurityRequirement().addList("my security"))
	                .components(new Components().addSecuritySchemes("my security",
	                        new SecurityScheme().name("my security").type(SecurityScheme.Type.HTTP).scheme("bearer")));
	    }

}
