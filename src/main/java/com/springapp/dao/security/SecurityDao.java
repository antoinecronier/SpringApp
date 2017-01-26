package com.springapp.dao.security;

import java.util.List;

import com.springapp.dao.interfaces.security.ISecurityDao;
import com.springapp.models.security.SecurityRole;
import com.springapp.models.security.SecurityUser;

public class SecurityDao implements ISecurityDao {

	@Override
	public void create(SecurityRole securityRole) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SecurityRole securityRole) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SecurityRole> getAllSecurityRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SecurityRole> getAllSecurityRoleByUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(SecurityUser securityUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SecurityUser securityUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public SecurityUser getSecurityUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SecurityUser securityUser,
			List<SecurityRole> securityRoles) {
		// TODO Auto-generated method stub

	}

}
