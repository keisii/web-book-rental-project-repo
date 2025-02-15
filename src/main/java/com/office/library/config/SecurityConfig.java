package com.office.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		System.out.println("[SecurityConfig] bCryptPasswordEncoder()");
		
		return new BCryptPasswordEncoder();
	}
}
