package com.rains.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rains.beans")
public class AppConfig {

	@Bean
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}
}
