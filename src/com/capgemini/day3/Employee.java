package com.capgemini.day3;

public class Employee {
	 private String employeeName;
	 private double hra;
	 private double pf;
	 private long employeeId;
	 private double basicSalary;
	 private double grossSalary;
	 private double medical;
	 private double netSalary;
	 public static final double pt = 200;
	
	
	 public Employee() {
		}
		
	 public Employee(int employeeId, String employeeName,double basicSalary,double medical) {
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.basicSalary = basicSalary;
			this.medical = medical;
		}
	 
	 public double salary(double amount) {
		if(basicSalary > 0) 
		{
			hra = (basicSalary*50)/100;
			pf = (basicSalary*12)/100;
			grossSalary = hra + basicSalary + medical;
			netSalary = grossSalary - (pf+pt);
			return netSalary;
		}
		else
			System.out.println("Zero balance.");
		 return amount;
		 
	 }
	 public void displayEmployeeInfo() {
			System.out.println("Employee Id: " + employeeId + "\nEmployee name: " + employeeName
					+ "\nEmployee Net salary: " + netSalary);
		} 
}
