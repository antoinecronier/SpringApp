package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.Project;

@Controller
@RequestMapping(ProjectViewController.BASE_URL)
public class ProjectViewController extends BaseViewController<Project> {

	public final static String BASE_URL = "/project";

	protected ProjectViewController() {
		super(Project.class);
	}
}
