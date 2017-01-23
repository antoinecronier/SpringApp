package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IStudentFileDao;
import com.springapp.models.StudentFile;

@Transactional
public class StudentFileDao extends BaseDao<StudentFile> implements IStudentFileDao {

	public StudentFileDao() {
		super(StudentFile.class);
	}

	@Override
	public StudentFile getById(Integer id) {
		return super.entityManager.find(StudentFile.class, id);
	}
}
