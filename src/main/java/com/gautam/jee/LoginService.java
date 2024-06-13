package com.gautam.jee;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("gautam") && password.equals("dummy");
	}

}