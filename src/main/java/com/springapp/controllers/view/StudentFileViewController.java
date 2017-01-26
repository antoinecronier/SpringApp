package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.StudentFile;

@Controller
@RequestMapping(StudentFileViewController.BASE_URL)
public class StudentFileViewController extends BaseViewController<StudentFile> {

	public final static String BASE_URL = "/studentfile";

	protected StudentFileViewController() {
		super(StudentFile.class);
	}
}
