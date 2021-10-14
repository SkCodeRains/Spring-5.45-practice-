package com.rains.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rains.beans.Vehicle;

@SuppressWarnings("deprecation")
public class Main {
	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/rains/cfgs/ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Vehicle ve = factory.getBean("vehicle", Vehicle.class);
		ve.startEngine();
		ve.move("Amravati", "akola");
		ve.stopEngine();

	}
}
