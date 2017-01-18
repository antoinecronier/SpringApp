package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IStudentFileDao;
import com.springapp.models.StudentFile;

@Transactional
public class StudentFileDao extends BaseDao<StudentFile> implements IStudentFileDao {

	@Override
	public StudentFile getById(Integer id) {
		return super.entityManager.find(StudentFile.class, id);
	}
}
