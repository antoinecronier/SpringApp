package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.ITeacherFileDao;
import com.springapp.models.TeacherFile;

@Transactional
public class TeacherFileDao extends BaseDao<TeacherFile> implements ITeacherFileDao {

	@Override
	public TeacherFile getById(Integer id) {
		return super.entityManager.find(TeacherFile.class, id);
	}
}
