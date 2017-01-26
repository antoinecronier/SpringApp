package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.TeacherFile;

@Controller
@RequestMapping(TeacherFileViewController.BASE_URL)
public class TeacherFileViewController extends BaseViewController<TeacherFile> {

	public final static String BASE_URL = "/teacherfile";

	protected TeacherFileViewController() {
		super(TeacherFile.class);
	}
}
