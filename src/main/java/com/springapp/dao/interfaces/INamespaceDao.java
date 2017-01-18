package com.springapp.dao.interfaces;

import org.springframework.stereotype.Repository;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.models.Namespace;

@Repository
public interface INamespaceDao extends IBaseDao<Namespace> {

}
