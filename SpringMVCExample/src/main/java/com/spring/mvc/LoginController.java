package com.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value= "/login", method=RequestMethod.GET)
	public String display1()
	{
		//show login page
		return "login";
	}
	
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public String display2(@RequestParam String name, ModelMap model,@RequestParam String password)
	{
		//handle login request

		if(!service.validateUser(name, password))
		{
		return "login";
		}
		
			model.put("name", name);
			return "welcome";
	}

	

}
