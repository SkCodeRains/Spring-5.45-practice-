package com.rains.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("per")
@PropertySource("com/rains/commons/info.rains")
public class PersonalInfo {
	@Value("${per.name}")
	private String pname;
	@Value("${per.age}")
	private int age;

	@Override
	public String toString() {
		return "PersonalInfo [pname=" + pname + ", age=" + age + "]";
	}

}
