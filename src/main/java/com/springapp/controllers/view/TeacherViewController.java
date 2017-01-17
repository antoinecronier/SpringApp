package com.springapp.controllers.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springapp.manager.interfaces.ITeacherManager;
import com.springapp.models.Teacher;
import com.springapp.utils.DumpFields;

@Controller
public class TeacherViewController {
	@GetMapping("/teachers/create")
	public String userCreate(Model model) {
		model.addAttribute("attributs", DumpFields.<Teacher>inspect(Teacher.class));
		return "teacher/teacherCreate";
	}

	@PostMapping("/teachers/create")
	public String itemTestRetreiver(String firstname, String lastname, String login,
			String password, String socity){
		Teacher teacher = new Teacher(firstname, lastname, login, password,
				socity);
		System.out.println(teacher);
		teacherManager.create(teacher);

		String redirectUrl = "/";
	    return "redirect:" + redirectUrl;
	}

	@Autowired
	private ITeacherManager teacherManager;

}
