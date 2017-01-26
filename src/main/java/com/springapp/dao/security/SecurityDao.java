package com.springapp.dao.security;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.dao.interfaces.security.ISecurityDao;
import com.springapp.models.Grade;
import com.springapp.models.security.SecurityRole;
import com.springapp.models.security.SecurityUser;

@Transactional
@Repository
public class SecurityDao implements ISecurityDao {

	@Override
	public void create(SecurityRole securityRole) throws Exception {
		entityManager.persist(securityRole);
	}

	@Override
	public void delete(SecurityRole securityRole) {
		if (entityManager.contains(securityRole))
			entityManager.remove(securityRole);
		else
			entityManager.remove(entityManager.merge(securityRole));
	}

	@Override
	public SecurityRole update(SecurityRole securityRole) {
		return entityManager.merge(securityRole);
	}

	@Override
	public SecurityRole getSecurityRole(Integer id) {
		return entityManager.find(SecurityRole.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SecurityRole> getAllSecurityRole() {
		return entityManager.createQuery(
				"select e from " + SecurityRole.class.getSimpleName() + " e")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAllUniqueRole() {
		ArrayList<String> result = new ArrayList<String>();
		List<SecurityRole> roles = entityManager.createQuery(
				"select e from " + SecurityRole.class.getSimpleName() + " e")
				.getResultList();
		for (SecurityRole securityRole : roles) {
			if (!result.contains(securityRole.getRole())) {
				result.add(securityRole.getRole());
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SecurityRole> getAllSecurityRoleByUser(String username) {
		return entityManager
				.createQuery(
						"select e from " + SecurityRole.class.getSimpleName()
								+ " e where e.username=:username")
				.setParameter("username", username).getResultList();
	}

	@Override
	public void create(SecurityUser securityUser) {
		entityManager.persist(securityUser);
	}

	@Override
	public void delete(SecurityUser securityUser) {
		if (entityManager.contains(securityUser))
			entityManager.remove(securityUser);
		else
			entityManager.remove(entityManager.merge(securityUser));
	}

	@Override
	public SecurityUser update(SecurityUser securityUser) {
		return entityManager.merge(securityUser);
	}

	@Override
	public SecurityUser getSecurityUser(String username) {
		return entityManager.find(SecurityUser.class, username);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SecurityUser> getAllSecurityUser() {
		return entityManager.createQuery(
				"select e from " + SecurityUser.class.getSimpleName() + " e")
				.getResultList();
	}

	@Override
	public void create(SecurityUser securityUser,
			List<SecurityRole> securityRoles) throws Exception {
		create(securityUser);
		for (SecurityRole securityRole : securityRoles) {
			create(securityRole);
		}
	}

	@Override
	public void delete(SecurityUser securityUser,
			List<SecurityRole> securityRoles) {
		for (SecurityRole securityRole : securityRoles) {
			delete(securityRole);
		}
		delete(securityUser);
	}

	@Override
	public void update(SecurityUser securityUser,
			List<SecurityRole> securityRoles) {
		for (SecurityRole securityRole : securityRoles) {
			update(securityRole);
		}
		update(securityUser);
	}

	@PersistenceContext
	protected EntityManager entityManager;
}
