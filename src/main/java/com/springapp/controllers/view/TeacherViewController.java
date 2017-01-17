package com.springapp.controllers.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.models.Teacher;
import com.springapp.utils.DumpFields;

@Controller
public class TeacherViewController {
	@GetMapping("/teachers/create")
	public String userCreate(Model model) {
		model.addAttribute("attributs", DumpFields.<Teacher>inspect(Teacher.class));
		return "teacherCreate";
	}

	@PostMapping("/teachers/create")
	public String itemTestRetreiver(@RequestBody final String teacher){
		System.out.println(teacher);
		teacherDao.create(new Teacher(teacher));
		return "welcome";
	}

	@Autowired
	private ITeacherDao teacherDao;

}
