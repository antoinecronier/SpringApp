package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.Grade;

@Controller
@RequestMapping(GradeViewController.BASE_URL)
public class GradeViewController extends BaseViewController<Grade> {

	public final static String BASE_URL = "/grade";

	protected GradeViewController() {
		super(Grade.class);
	}
}
