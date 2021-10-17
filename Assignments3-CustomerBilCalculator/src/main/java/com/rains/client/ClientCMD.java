package com.rains.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rains.controller.Controller;
import com.rains.vo.CustomerVO;

public class ClientCMD {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rains/cfgs/ApplicationContext.xml");

		// get Inputs from user
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Customer Address : ");
		String address = sc.nextLine();
		System.out.print("Enter  Principal Amount : ");
		String sal = sc.nextLine();
		System.out.print("Enter  rate : ");
		String rate = sc.nextLine();
		System.out.print("Enter  time period : ");
		String time = sc.nextLine();

// setting Vo object
		CustomerVO vo = new CustomerVO();
		vo.setCustName(name);
		vo.setCustAddress(address);
		vo.setpAmt(sal);
		vo.setRate(rate);
		vo.setTime(time);
		// get Controller from
		Controller controller = factory.getBean("controller", Controller.class);
		try {
			System.out.println(controller.processCustomer(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
