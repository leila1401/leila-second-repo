package com.saraya;

import org.springframework.stereotype.Service;

@Service

public class LoginService {
public boolean validateUser(String user , String password) {
	return user.equalsIgnoreCase("leila") && password.equalsIgnoreCase("niang");
}
}
