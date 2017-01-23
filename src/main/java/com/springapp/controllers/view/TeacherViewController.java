package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.BaseController;
import com.springapp.controllers.view.base.BaseViewController;
import com.springapp.models.Teacher;
import com.springapp.utils.DumpFields;

@Controller
@RequestMapping("/teacher")
public class TeacherViewController extends BaseViewController<Teacher> {

	public TeacherViewController(){
		super(Teacher.class);
	}
}
