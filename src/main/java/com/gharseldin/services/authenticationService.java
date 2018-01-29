package com.gharseldin.services;

import org.springframework.stereotype.Service;

@Service
public class authenticationService {

	public boolean isUserValid(String username, String password) {
		if(username.equals("Amr") && password.equals("any"))
			return true;
		return false;
	}
}
