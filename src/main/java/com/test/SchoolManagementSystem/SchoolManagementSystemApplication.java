package com.test.SchoolManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.test.SchoolManagementSystem.config.JwtRequestFilter;
import com.test.SchoolManagementSystem.config.JwtTokenUtil;

@SpringBootApplication
public class SchoolManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}
	
	@Bean
	public JwtRequestFilter jwtRequestFilter(JwtTokenUtil jwtTokenUtil, UserDetailsService userDetailsService, AuthenticationManager authenticationManager) {
	    return new JwtRequestFilter(jwtTokenUtil, userDetailsService, authenticationManager);
	}


}
