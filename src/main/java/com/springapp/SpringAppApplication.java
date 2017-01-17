package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springapp.dao.TeacherDao;
import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.manager.TeacherManager;
import com.springapp.manager.interfaces.ITeacherManager;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@Bean
	public ITeacherDao getTeacherDao(){
		return new TeacherDao();
	}

	@Bean
	public ITeacherManager getTeacherManager(){
		return new TeacherManager();
	}
}
