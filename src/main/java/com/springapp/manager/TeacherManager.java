package com.springapp.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.manager.interfaces.ITeacherManager;
import com.springapp.models.Teacher;

public class TeacherManager implements ITeacherManager {

	@Override
	public void create(Teacher item) {
		teacherDao.create(item);
	}

	@Override
	public void delete(Teacher item) {
		teacherDao.delete(item);
	}

	@Override
	public List getAll() {
		return teacherDao.getAll();
	}

	@Override
	public Teacher getById(Integer id) {
		return teacherDao.getById(id);
	}

	@Override
	public void update(Teacher item) {
		teacherDao.update(item);
	}

	@Autowired
	private ITeacherDao teacherDao;
}
