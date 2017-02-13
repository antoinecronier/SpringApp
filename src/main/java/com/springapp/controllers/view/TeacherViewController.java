package com.springapp.controllers.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.dao.crud.interfaces.ITeacherCrudRepository;
import com.springapp.models.Teacher;
import com.springapp.utils.DumpFields;

//@Controller
//@RequestMapping(TeacherViewController.BASE_URL)
//@Secured({"ROLE_ADMIN"})
//public class TeacherViewController extends BaseViewController<Teacher> {
//
//	public final static String BASE_URL = "/teacher";
//
//	public TeacherViewController(){
//		super(Teacher.class);
//	}
//}

@Controller
@RequestMapping(TeacherViewController.BASE_URL)
@Secured({"ROLE_ADMIN"})
public class TeacherViewController {

	public final static String BASE_URL = "/teacher";

	public TeacherViewController(){
	}

	@RequestMapping(value={"/", "list"}, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("page", "index");
		model.addAttribute("attributs", DumpFields.<Teacher> inspectBaseAttribut(Teacher.class));
		model.addAttribute("currentItems", DumpFields.listFielder((List<Teacher>)crudder.findAll()));
		return "baseview/list";
	}

	@Autowired
	private ITeacherCrudRepository crudder;
}