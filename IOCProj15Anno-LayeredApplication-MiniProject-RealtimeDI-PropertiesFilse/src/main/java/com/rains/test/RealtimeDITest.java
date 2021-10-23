package com.rains.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rains.controller.MainController;
import com.rains.vo.StudenVO;

public class RealtimeDITest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"com/rains/cfgs/ApplicationContext.xml");

		///
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Student Address : ");
		String address = sc.nextLine();
		System.out.print("Enter Student M1 : ");
		String M1 = sc.nextLine();

		System.out.print("Enter Student M2 : ");
		String M2 = sc.nextLine();

		System.out.print("Enter Student M3 : ");
		String M3 = sc.nextLine();

		StudenVO vo = new StudenVO();
		vo.setM1(M1);
		vo.setM2(M2);
		vo.setM3(M3);
		vo.setSname(name);
		vo.setSadd(address);
		// getting controller
		MainController controller = factory.getBean("controller", MainController.class);

		try {
			String result = controller.processStudent(vo);
			System.out.println("Final result : " + result);
		} catch (Exception e) {
			System.out.println("Internal problem : " + e.getMessage());
		}

		sc.close();
		factory.close();

	}
}
