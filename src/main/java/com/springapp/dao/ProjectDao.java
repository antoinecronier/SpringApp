package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IProjectDao;
import com.springapp.models.Project;

@Transactional
public class ProjectDao extends BaseDao<Project> implements IProjectDao {

	@Override
	public Project getById(Integer id) {
		return super.entityManager.find(Project.class, id);
	}
}
