package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springapp.dao.TeacherDao;
import com.springapp.dao.interfaces.ITeacherDao;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@Bean
	public ITeacherDao getUserDao(){
		return new TeacherDao();
	}
}
