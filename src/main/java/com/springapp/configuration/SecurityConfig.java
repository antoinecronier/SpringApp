package com.springapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable();

		/*httpSecurity.anonymous().and().authorizeRequests().antMatchers("/**")
				.permitAll().antMatchers("/**").authenticated();*/

//		httpSecurity.authorizeRequests()
//	    	.antMatchers("/", "/teacher/**", "/teacherfile/**").permitAll()
//	    	.anyRequest().authenticated();
		//.antMatchers("/teacher/**").access("hasRole('ROLE_ADMIN')")

		httpSecurity
				.authorizeRequests()
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
					.loginPage("/login")
					.permitAll()
			.and()
        		.httpBasic();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("USER");
	  auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
	  auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");
	}
}
