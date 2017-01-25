package com.springapp.configuration.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.models.Teacher;

@Controller
public class LoginController {
	private static final String LOGIN = "login/login";

	@RequestMapping("/login")
	public String login(HttpSession session) {
		return LOGIN;
	}
}
