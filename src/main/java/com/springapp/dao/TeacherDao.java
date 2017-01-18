package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.models.Teacher;


@Transactional
public class TeacherDao extends BaseDao<Teacher> implements ITeacherDao {

	@Override
	public Teacher getById(Integer id) {
		return super.entityManager.find(Teacher.class, id);
	}
}
