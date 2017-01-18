package com.springapp.dao.interfaces;

import org.springframework.stereotype.Repository;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.models.StudentFile;

@Repository
public interface IStudentFileDao extends IBaseDao<StudentFile> {

}
