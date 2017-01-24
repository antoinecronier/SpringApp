package com.springapp.configuration.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	private static final String LOGIN = "login/login";

	@RequestMapping("/login")
	public String login() {
		return LOGIN;
	}
}
