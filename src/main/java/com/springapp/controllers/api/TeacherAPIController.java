package com.springapp.controllers.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.controllers.api.base.BaseApiController;
import com.springapp.models.Teacher;

@RestController
@RequestMapping("/api/teacher")
public class TeacherAPIController extends BaseApiController<Teacher> {

	protected TeacherAPIController() {
		super(Teacher.class);

	}
}
