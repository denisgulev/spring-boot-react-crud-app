package com.denis.sb.react.security;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtAuthenticationConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

	private JwtAuthenticationService jwtAuthenticationService;
	
	public JwtAuthenticationConfigurer(JwtAuthenticationService jwtAuthenticationService) {
		this.jwtAuthenticationService = jwtAuthenticationService;
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter(jwtAuthenticationService);
		
		http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
	}
	
}
