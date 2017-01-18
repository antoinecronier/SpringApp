package com.springapp.controllers.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springapp.manager.interfaces.ITeacherFileManager;
import com.springapp.models.Namespace;
import com.springapp.models.Teacher;
import com.springapp.models.TeacherFile;
import com.springapp.utils.DumpFields;

@Controller
public class TeacherFileViewController {
	@GetMapping("/teacherfiles/create")
	public String userCreate(Model model) {
		model.addAttribute("attributs", DumpFields.<Teacher>inspect(Teacher.class));
		return "teacherfile/teacherFileCreate";
	}

	@PostMapping("/teacherfiles/create")
	public String itemTestRetreiver(String name, Namespace namespace){
		TeacherFile teacherFile = new TeacherFile(name,namespace);
		System.out.println(teacherFile);
		teacherFileManager.create(teacherFile);

		String redirectUrl = "/";
	    return "redirect:" + redirectUrl;
	}

	@Autowired
	private ITeacherFileManager teacherFileManager;
}
