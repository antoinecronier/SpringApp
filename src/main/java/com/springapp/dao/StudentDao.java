package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IStudentDao;
import com.springapp.models.Student;

@Transactional
public class StudentDao extends BaseDao<Student> implements IStudentDao {

	@Override
	public Student getById(Integer id) {
		return super.entityManager.find(Student.class, id);
	}
}
