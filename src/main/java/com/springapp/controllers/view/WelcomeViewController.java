package com.springapp.controllers.view;

import java.security.Principal;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeViewController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/")
	public String welcome(Map<String, Object> model, final HttpServletRequest request, Principal principal) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}
}
