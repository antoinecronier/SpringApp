package com.springapp.controllers.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.view.base.BaseViewController;
import com.springapp.manager.interfaces.ITeacherFileManager;
import com.springapp.models.Namespace;
import com.springapp.models.Teacher;
import com.springapp.models.TeacherFile;
import com.springapp.utils.DumpFields;

@Controller
@RequestMapping("/teacherfile")
public class TeacherFileViewController extends BaseViewController<TeacherFile> {

	protected TeacherFileViewController() {
		super(TeacherFile.class);
	}

}
