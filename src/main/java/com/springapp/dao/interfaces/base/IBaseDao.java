package com.springapp.dao.interfaces.base;

import java.util.List;

public abstract interface IBaseDao<T> {
	public void create(T item);
	public void delete(T item);
	public List getAll();
	public T getById(Integer id);
	public void update(T item);
}
