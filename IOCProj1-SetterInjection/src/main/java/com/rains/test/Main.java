package com.rains.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rains.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/java/com/rains/cfgs/ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(fsr);

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg.generateMessage("King"));
	}

}
