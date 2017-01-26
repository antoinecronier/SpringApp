package com.springapp.dao.interfaces.security;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springapp.models.security.SecurityRole;
import com.springapp.models.security.SecurityUser;


public interface ISecurityDao {
	public void create(SecurityRole securityRole) throws Exception;
	public void delete(SecurityRole securityRole);
	public SecurityRole update(SecurityRole securityRole);
	public SecurityRole getSecurityRole(Integer id);

	public List<SecurityRole> getAllSecurityRole();
	public List<String> getAllUniqueRole();
	public List<SecurityRole> getAllSecurityRoleByUser(String username);

	public void create(SecurityUser securityUser) throws Exception;
	public void delete(SecurityUser securityUser);
	public SecurityUser update(SecurityUser securityUser);
	public SecurityUser getSecurityUser(String username);

	public List<SecurityUser> getAllSecurityUser();

	public void create(SecurityUser securityUser,List<SecurityRole> securityRoles) throws Exception;
	public void delete(SecurityUser securityUser,List<SecurityRole> securityRoles);
	public void update(SecurityUser securityUser,List<SecurityRole> securityRoles);
}
