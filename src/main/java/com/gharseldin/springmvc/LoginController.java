package com.gharseldin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gharseldin.mvc.authenticationService;

@Controller
public class LoginController {

	authenticationService service = new authenticationService();

	@RequestMapping(value = "/login")
	public String sayHello() {
		return "login";
	}

	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public String showAuthPage() {
		return "authenticationForm";
	}

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {

		if (service.isUserValid(username, password)) {
			model.put("username", username);
			model.put("password", password);
			return "welcome";
		} else {
			model.put("error", "INVALID CREDENTIALS");
			return "authenticationForm";
		}
	}

}
