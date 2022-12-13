package com.spring.rest.a4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.a4.CreditCardModel;
import com.spring.rest.a4.ServiceCreditCheck;

@RestController
public class RestCreditCardController {
	
	@Autowired
	ServiceCreditCheck service;
	
	@RequestMapping(value="/validate", method=RequestMethod.PUT)
	public CreditCardModel validate(@RequestParam("credit_card") String card) {
		CreditCardModel cc = service.validate(card);
		return cc;
	}
	
	@RequestMapping("/check")
	public String checking() {
		String rs = service.check();
		return rs;
	}
}
