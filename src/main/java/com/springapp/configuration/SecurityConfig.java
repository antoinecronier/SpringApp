package com.springapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable();

		/*httpSecurity.anonymous().and().authorizeRequests().antMatchers("/**")
				.permitAll().antMatchers("/**").authenticated();*/

		httpSecurity.authorizeRequests()
	    .antMatchers("/", "/teacher/**", "/teacherfile/**").permitAll()
	    .anyRequest().authenticated()
	    .and();
	}

//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/resources/**");
//	}

}
