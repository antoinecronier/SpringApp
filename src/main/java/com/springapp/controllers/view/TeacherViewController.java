package com.springapp.controllers.view;

import javax.servlet.http.HttpSession;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapp.controllers.view.base.BaseViewController;
import com.springapp.models.Teacher;

@Controller
@RequestMapping("/teacher")
@Secured({"ROLE_ADMIN"})
public class TeacherViewController extends BaseViewController<Teacher> {

	public TeacherViewController(){
		super(Teacher.class);
	}
}
