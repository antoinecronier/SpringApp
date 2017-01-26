package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.Student;

@Controller
@RequestMapping(StudentViewController.BASE_URL)
public class StudentViewController extends BaseViewController<Student> {

	public final static String BASE_URL = "/student";

	protected StudentViewController() {
		super(Student.class);
	}
}
