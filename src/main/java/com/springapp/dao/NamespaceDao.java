package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.INamespaceDao;
import com.springapp.models.Namespace;

@Transactional
public class NamespaceDao extends BaseDao<Namespace> implements INamespaceDao {

	@Override
	public Namespace getById(Integer id) {
		return super.entityManager.find(Namespace.class, id);
	}
}
