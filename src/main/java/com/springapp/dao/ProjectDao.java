package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IProjectDao;
import com.springapp.models.Project;

@Transactional
public class ProjectDao extends BaseDao<Project> implements IProjectDao {

	public ProjectDao() {
		super(Project.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Project getById(Integer id) {
		return super.entityManager.find(Project.class, id);
	}
}
