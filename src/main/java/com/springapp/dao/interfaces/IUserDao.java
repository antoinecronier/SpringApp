package com.springapp.dao.interfaces;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.models.User;

@Repository
@Transactional
public interface IUserDao extends IBaseDao {
	public void create(User user);
	public void delete(User user);
	public List getAll();
	public User getByEmail(String email);
	public User getById(long id);
	public void update(User user);
}
