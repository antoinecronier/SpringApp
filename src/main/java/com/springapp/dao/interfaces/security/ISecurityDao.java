package com.springapp.dao.interfaces.security;

import java.util.List;

import com.springapp.models.security.SecurityRole;
import com.springapp.models.security.SecurityUser;

public interface ISecurityDao {
	public void create(SecurityRole securityRole);
	public void delete(SecurityRole securityRole);
	public List<SecurityRole> getAllSecurityRole();
	public List<SecurityRole> getAllSecurityRoleByUser(String username);

	public void create(SecurityUser securityUser);
	public void delete(SecurityUser securityUser);
	public SecurityUser getSecurityUser(Integer id);
	public void update(SecurityUser securityUser,List<SecurityRole> securityRoles);
}
