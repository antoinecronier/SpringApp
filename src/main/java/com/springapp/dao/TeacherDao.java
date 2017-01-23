package com.springapp.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.models.Teacher;

@Service
@Transactional
public class TeacherDao extends BaseDao<Teacher> implements ITeacherDao {

	public TeacherDao() {
		super(Teacher.class);
	}

	@Override
	public Teacher getById(Integer id) {
		return super.entityManager.find(Teacher.class, id);
	}
}
