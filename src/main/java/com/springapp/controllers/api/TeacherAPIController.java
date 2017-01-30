package com.springapp.controllers.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.controllers.base.api.BaseApiController;
import com.springapp.models.Teacher;

@RestController
@RequestMapping(TeacherAPIController.MODEL_API_URL)
public class TeacherAPIController extends BaseApiController<Teacher> {

	public final static String MODEL_API_URL = BaseApiController.BASE_API_URL + "/teacher";

	protected TeacherAPIController() {
		super(Teacher.class);
	}
}
