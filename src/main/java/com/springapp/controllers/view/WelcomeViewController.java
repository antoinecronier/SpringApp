package com.springapp.controllers.view;

import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springapp.models.Teacher;
import com.springapp.utils.DumpFields;
import com.springapp.utils.JsonManager;

@Controller
public class WelcomeViewController {

	public static final String VIEW_CONTROLLER = "com.springapp.controllers.view";

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping(value = { "/", "/welcome" })
	public String welcome(Map<String, Object> model,
			final HttpServletRequest request, Principal principal,
			Session session, SecurityContext securityContext,
			HttpServletResponse response) {
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

		model.put("redirectTest", "<a href='https://lmgtfy.com/?q=" + "potatoes" +"'> Click me </a>");
		response.addCookie(new Cookie("hitCookie", "0"));

		return "welcome";
	}
}
