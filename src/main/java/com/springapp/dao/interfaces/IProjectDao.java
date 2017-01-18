package com.springapp.dao.interfaces;

import org.springframework.stereotype.Repository;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.models.Project;

@Repository
public interface IProjectDao extends IBaseDao<Project> {

}
