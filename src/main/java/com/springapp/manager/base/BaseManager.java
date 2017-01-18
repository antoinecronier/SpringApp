package com.springapp.manager.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springapp.dao.interfaces.base.IBaseDao;

public abstract class BaseManager<T> {

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


	public void update(T item) {
		dao.update(item);
	}

	@Autowired
	private IBaseDao<T> dao;
}
