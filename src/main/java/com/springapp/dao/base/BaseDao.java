package com.springapp.dao.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.dao.interfaces.base.IBaseDao;

@Service
@Transactional
public abstract class BaseDao<T> implements IBaseDao<T> {

	private Class<T> clazz;

	public BaseDao(Class<T> clazz) {
		this.clazz = clazz;
	}

	public void create(T item) {
		entityManager.persist(item);
		return;
	}

	public void delete(T item) {
		if (entityManager.contains(item))
			entityManager.remove(item);
		else
			entityManager.remove(entityManager.merge(item));
		return;
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return entityManager.createQuery(
				"select e from " + clazz.getSimpleName() + " e")
				.getResultList();
	}

	public void update(T item) {
		entityManager.merge(item);
		return;
	}

	@PersistenceContext
	protected EntityManager entityManager;
}
