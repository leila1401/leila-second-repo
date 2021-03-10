package com.saraya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public String showloginpage() {
		return "login";
	}
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public String UserLogin(ModelMap model , @RequestParam String name, @RequestParam String password) {
		if(!loginservice.validateUser(name, password)) {
			model.put("errorMessage" , "Invalid Credential");
			return "login";
	}
		model.put("name" , name);
		return "welcome";
	
	
	
	
	
	}

}
