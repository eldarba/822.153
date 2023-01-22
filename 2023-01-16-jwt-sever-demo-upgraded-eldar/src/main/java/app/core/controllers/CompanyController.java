package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/company")
public class CompanyController {

	@PutMapping(headers = { HttpHeaders.AUTHORIZATION })
	public String updateCoupon(int couponId) {
		return "company updated coupon " + couponId;
	}

}
