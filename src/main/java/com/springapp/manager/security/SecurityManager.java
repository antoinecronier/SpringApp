package com.springapp.manager.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.interfaces.security.ISecurityDao;
import com.springapp.manager.interfaces.security.ISecurityManager;
import com.springapp.models.security.SecurityRole;
import com.springapp.models.security.SecurityUser;

@Service
public class SecurityManager implements ISecurityManager {

	@Override
	public void create(SecurityRole securityRole) throws Exception {
		dao.create(securityRole);
	}

	@Override
	public void delete(SecurityRole securityRole) {
		dao.delete(securityRole);
	}

	@Override
	public SecurityRole update(SecurityRole securityRole) {
		return dao.update(securityRole);
	}

	@Override
	public SecurityRole getSecurityRole(Integer id) {
		return dao.getSecurityRole(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SecurityRole> getAllSecurityRole() {
		return dao.getAllSecurityRole();
	}

	@Override
	public List<String> getAllUniqueRole() {
		return dao.getAllUniqueRole();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SecurityRole> getAllSecurityRoleByUser(String username) {
		return dao.getAllSecurityRoleByUser(username);
	}

	@Override
	public void create(SecurityUser securityUser) throws Exception {
		dao.create(securityUser);
	}

	@Override
	public void delete(SecurityUser securityUser) {
		dao.delete(securityUser);
	}

	@Override
	public SecurityUser update(SecurityUser securityUser) {
		return dao.update(securityUser);
	}

	@Override
	public SecurityUser getSecurityUser(String username) {
		return dao.getSecurityUser(username);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SecurityUser> getAllSecurityUser() {
		return dao.getAllSecurityUser();
	}

	@Override
	public void create(SecurityUser securityUser,
			List<SecurityRole> securityRoles) throws Exception {
		dao.create(securityUser, securityRoles);
	}

	@Override
	public void delete(SecurityUser securityUser,
			List<SecurityRole> securityRoles) {
		dao.delete(securityUser, securityRoles);
	}

	@Override
	public void update(SecurityUser securityUser,
			List<SecurityRole> securityRoles) {
		dao.update(securityUser, securityRoles);
	}

	@Autowired
	private ISecurityDao dao;
}
