package com.springapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.models.Teacher;

/**
 * This class is used to access data for the Teacher entity. Repository annotation
 * allows the component scanning support to find and configure the DAO wihtout
 * any XML configuration and also provide the Spring exceptiom translation.
 * Since we've setup setPackagesToScan and transaction manager on
 * DatabaseConfig, any bean method annotated with Transactional will cause
 * Spring to magically call begin() and commit() at the start/end of the method.
 * If exception occurs it will also call rollback().
 */

@Transactional
public class TeacherDao implements ITeacherDao {

	/**
	 * Save the teacher in the database.
	 */
	public void create(Teacher teacher) {
		entityManager.persist(teacher);
		return;
	}

	/**
	 * Delete the teacher from the database.
	 */
	public void delete(Teacher teacher) {
		if (entityManager.contains(teacher))
			entityManager.remove(teacher);
		else
			entityManager.remove(entityManager.merge(teacher));
		return;
	}

	/**
	 * Return all the teachers stored in the database.
	 */
	@SuppressWarnings("unchecked")
	public List getAll() {
		return entityManager.createQuery("from Teacher").getResultList();
	}

	/**
	 * Return the teacher having the passed id.
	 */
	public Teacher getById(Integer id) {
		return entityManager.find(Teacher.class, id);
	}

	/**
	 * Update the passed teacher in the database.
	 */
	public void update(Teacher teacher) {
		entityManager.merge(teacher);
		return;
	}

	// Private fields

	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;
}
