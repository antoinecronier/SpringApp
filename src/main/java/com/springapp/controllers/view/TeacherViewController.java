package com.springapp.controllers.view;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.Teacher;

@Controller
@RequestMapping(TeacherViewController.BASE_URL)
@Secured({"ROLE_ADMIN"})
public class TeacherViewController extends BaseViewController<Teacher> {

	public final static String BASE_URL = "/teacher";

	public TeacherViewController(){
		super(Teacher.class);
	}
}
