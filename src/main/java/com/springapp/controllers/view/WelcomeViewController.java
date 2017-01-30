package com.springapp.controllers.view;

import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springapp.utils.DumpFields;

@Controller
public class WelcomeViewController {

	public static final String VIEW_CONTROLLER = "com.springapp.controllers.view";

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping(value = { "/", "/welcome" })
	public String welcome(Map<String, Object> model,
			final HttpServletRequest request, Principal principal,
			Session session, SecurityContext securityContext) {
		model.put("time", new Date());
		model.put("message", this.message);
		try {
			model.put("controllers",
					DumpFields.getClassesNames(VIEW_CONTROLLER));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "welcome";
	}
}
