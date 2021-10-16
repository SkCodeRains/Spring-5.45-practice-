package com.rains.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rains.controller.EmployeeController;
import com.rains.vo.EmployeeVO;

public class ClientCMD {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rains/cfgs/ApplicationContext.xml");

		// get Inputs from user
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Employee Address : ");
		String address = sc.nextLine();
		System.out.print("Enter Employee Salary : ");
		String sal = sc.nextLine();
// setting Vo object
		EmployeeVO vo = new EmployeeVO();
		vo.seteName(name);
		vo.seteAddress(address);
		vo.seteSal(sal);
		// get Controller from

		EmployeeController controller = factory.getBean("controller", EmployeeController.class);
		try {
			System.out.println(controller.processEmployee(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
