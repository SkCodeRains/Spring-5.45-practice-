package com.rains.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.rains")
@PropertySource("com/rains/commons/jdbc2.properties")
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean(name = "dtsrc")
	public DriverManagerDataSource createDMDS() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		try {
			dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
			dmds.setUrl(env.getRequiredProperty("jdbc.url"));
			dmds.setUsername(env.getRequiredProperty("jdbc.username"));
			dmds.setPassword(env.getRequiredProperty("jdbc.password"));
		} catch (Exception e) {
			System.out.println("ExceptionOccured :: " + e);
		}
		return dmds;
	}
}
