package com.springapp.manager.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.manager.interfaces.base.IBaseManager;

@Service
public abstract class BaseManager<T> implements IBaseManager<T> {

	public void create(T item) {
		dao.create(item);
	}

	public void delete(T item) {
		dao.delete(item);
	}

	public List getAll() {
		return dao.getAll();
	}


	public T getById(Integer id) {
		return dao.getById(id);
	}

	public T update(T item) {
		return dao.update(item);
	}

	@Autowired
	private IBaseDao<T> dao;
}
