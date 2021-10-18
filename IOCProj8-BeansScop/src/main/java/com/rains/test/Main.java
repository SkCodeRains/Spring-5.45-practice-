package com.rains.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rains.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/java/com/rains/cfgs/ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(fsr);

		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator wmg2 = factory.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator wmg3 = factory.getBean("wmg1", WishMessageGenerator.class);

		System.out.println("wmg1==wmg2 : " + (wmg1 == wmg2));
		System.out.println("wmg1 hashCode : " + wmg1.hashCode() + "\nwmg2 hashCode : " + wmg2.hashCode());
		System.out.println("\n\n");
		System.out.println("wmg1==wmg3 : " + (wmg1 == wmg3));
		System.out.println("wmg1 hashCode : " + wmg1.hashCode() + "\nwmg3 hashCode : " + wmg3.hashCode());
	}

}
