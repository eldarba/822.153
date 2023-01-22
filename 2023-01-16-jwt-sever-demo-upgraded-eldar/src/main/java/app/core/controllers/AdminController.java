package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@DeleteMapping(headers = { HttpHeaders.AUTHORIZATION })
	public String deleteCompany(int companyId) {
		return "Admin deleted company " + companyId;
	}

}
