package com.rains.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.beans.CheckingVoterEligibility;

public class RealtimeDITest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rains/cfgs/ApplicationContext.xml");
		CheckingVoterEligibility c = factory.getBean("voter", CheckingVoterEligibility.class);
		System.out.println(c.checkingelegibility());
		factory.destroySingletons();

	}
}
