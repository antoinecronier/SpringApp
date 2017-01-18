package com.springapp.dao.interfaces;

import org.springframework.stereotype.Repository;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.models.Grade;

@Repository
public interface IGradeDao extends IBaseDao<Grade> {

}
