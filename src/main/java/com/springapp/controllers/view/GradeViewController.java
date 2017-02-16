package com.springapp.controllers.view;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.Grade;

@Controller
@RequestMapping(GradeViewController.BASE_URL)
public class GradeViewController extends BaseViewController<Grade> {

	public final static String BASE_URL = "/grade";

	protected GradeViewController() {
		super(Grade.class);
	}

	/* (non-Javadoc)
	 * @see com.springapp.controllers.base.view.BaseViewController#index(org.springframework.ui.Model)
	 */
	@Override
	public String index(Model model,HttpServletRequest request) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		String username;

		if (principal instanceof UserDetails) {
		  username = ((UserDetails)principal).getUsername();
		} else {
		  username = principal.toString();
		}

		System.out.println(username);


		Cookie cookie = WebUtils.getCookie(request, "hitCookie");
		System.out.println(cookie.getValue());

		return super.index(model, request);
	}
}
