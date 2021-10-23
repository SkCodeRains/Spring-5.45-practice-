package com.rains.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rains.beans.Student;

public class SetterVSConstructorInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rains/cfgs/ApplicationContext.xml");

		Student st = factory.getBean("stud", Student.class);
		System.out.println(st);
	}

}
