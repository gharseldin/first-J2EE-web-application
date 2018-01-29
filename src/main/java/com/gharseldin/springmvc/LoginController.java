package com.gharseldin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value="/auth")
	public String authenticate() {
		return "authenticationForm";
	}
}
