package com.springapp.dao.crud.base;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ICrudRepositoryBase<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
