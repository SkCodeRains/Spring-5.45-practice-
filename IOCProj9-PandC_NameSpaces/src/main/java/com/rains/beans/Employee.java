package com.rains.beans;

public class Employee {
	private int eno;
	private String ename;
	private float salary;
	private Department dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}	

	public int getEno() {
		System.out.println("Employee.getEno()");
		return eno;
	}

	public void setEno(int eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}

	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}

	public float getSalary() {
		System.out.println("Employee.getSalary()");
		return salary;
	}

	public void setSalary(float salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
	}

	public Department getDept() {
		System.out.println("Employee.getDept()");
		return dept;
	}

	public void setDept(Department dept) {
		System.out.println("Employee.setDept()");
		this.dept = dept;
	}

	@Override
	public String toString() {
		
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
