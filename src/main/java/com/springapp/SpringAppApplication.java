package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springapp.dao.GradeDao;
import com.springapp.dao.NamespaceDao;
import com.springapp.dao.ProjectDao;
import com.springapp.dao.StudentDao;
import com.springapp.dao.StudentFileDao;
import com.springapp.dao.TeacherDao;
import com.springapp.dao.TeacherFileDao;
import com.springapp.dao.interfaces.IGradeDao;
import com.springapp.dao.interfaces.INamespaceDao;
import com.springapp.dao.interfaces.IProjectDao;
import com.springapp.dao.interfaces.IStudentDao;
import com.springapp.dao.interfaces.IStudentFileDao;
import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.dao.interfaces.ITeacherFileDao;
import com.springapp.manager.GradeManager;
import com.springapp.manager.NamespaceManager;
import com.springapp.manager.ProjectManager;
import com.springapp.manager.StudentFileManager;
import com.springapp.manager.StudentManager;
import com.springapp.manager.TeacherFileManager;
import com.springapp.manager.TeacherManager;
import com.springapp.manager.interfaces.IGradeManager;
import com.springapp.manager.interfaces.INamespaceManager;
import com.springapp.manager.interfaces.IProjectManager;
import com.springapp.manager.interfaces.IStudentFileManager;
import com.springapp.manager.interfaces.IStudentManager;
import com.springapp.manager.interfaces.ITeacherFileManager;
import com.springapp.manager.interfaces.ITeacherManager;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

//	@Bean
//	public ITeacherDao getTeacherDao(){
//		return new TeacherDao();
//	}
//
//	@Bean
//	public ITeacherManager getTeacherManager(){
//		return new TeacherManager();
//	}

	@Bean
	public ITeacherFileDao getTeacherFileDao(){
		return new TeacherFileDao();
	}

	@Bean
	public ITeacherFileManager getTeacherFileManager(){
		return new TeacherFileManager();
	}

	@Bean
	public IStudentDao getStudentDao(){
		return new StudentDao();
	}

	@Bean
	public IStudentManager getStudentManager(){
		return new StudentManager();
	}

	@Bean
	public IStudentFileDao getStudentFileDao(){
		return new StudentFileDao();
	}

	@Bean
	public IStudentFileManager getStudentFileManager(){
		return new StudentFileManager();
	}

	@Bean
	public IProjectDao getProjectDao(){
		return new ProjectDao();
	}

	@Bean
	public IProjectManager getProjectManager(){
		return new ProjectManager();
	}

	@Bean
	public INamespaceDao getNamespaceDao(){
		return new NamespaceDao();
	}

	@Bean
	public INamespaceManager getNamespaceManager(){
		return new NamespaceManager();
	}

	@Bean
	public IGradeDao getGradeDao(){
		return new GradeDao();
	}

	@Bean
	public IGradeManager getGradeManager(){
		return new GradeManager();
	}
}
