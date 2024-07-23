package com.pyro.testModel;

public class Employee {
	private int empId;
	private String empName;
	private int age;
	private double salary;
	
	public Employee(int empId, String empName, int age, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
}
