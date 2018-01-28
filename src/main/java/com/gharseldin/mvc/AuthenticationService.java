package com.gharseldin.mvc;

public class authenticationService {

	public boolean isUserValid(String username, String password) {
		if(username.equals("Amr") && password.equals("any"))
			return true;
		return false;
	}
}
