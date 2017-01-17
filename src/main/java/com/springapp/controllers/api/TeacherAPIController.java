package com.springapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springapp.manager.interfaces.ITeacherManager;
import com.springapp.models.Teacher;

@Controller
public class TeacherAPIController {

	/**
	 * Create a new user with an auto-generated id and email and name as passed
	 * values.
	 */
	@RequestMapping(value = "/create")
	@ResponseBody
	public String create(String firstname, String lastname, String login,
			String password, String socity) {
		try {
			Teacher teacher = new Teacher(firstname, lastname, login, password,
					socity);
			teacherManager.create(teacher);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Teacher succesfully created!";
	}

	/**
	 * Delete the user with the passed id.
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(Integer id) {
		try {
			Teacher teacher = new Teacher(id);
			teacherManager.delete(teacher);
		} catch (Exception ex) {
			return "Error deleting the user: " + ex.toString();
		}
		return "Teacher succesfully deleted!";
	}

	/**
	 * Update the email and the name for the user indentified by the passed id.
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	public String updateName(Integer id, String firstname, String lastname, String login,
			String password, String socity) {
		try {
			Teacher teacher = teacherManager.getById(id);
			teacher.setFirstname(firstname);
			teacher.setLastname(lastname);
			teacher.setLogin(login);
			teacher.setPassword(password);
			teacher.setSocity(socity);
			teacherManager.update(teacher);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "Teacher succesfully updated!";
	}

	@Autowired
	private ITeacherManager teacherManager;
}
