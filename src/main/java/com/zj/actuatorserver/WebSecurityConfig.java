package com.zj.actuatorserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("password").roles("ADMIN");
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		BasicAuthenticationEntryPoint authenticationEntryPoint = new BasicAuthenticationEntryPoint();
//		authenticationEntryPoint.setRealmName("example");
//		http.httpBasic().authenticationEntryPoint(authenticationEntryPoint);
//		http.authorizeRequests().antMatchers("/health").permitAll();
//	}
	
}
