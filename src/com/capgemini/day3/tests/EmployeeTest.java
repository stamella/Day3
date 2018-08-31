package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.capgemini.day3.Employee;

class EmployeeTest {

	Employee employee;
	Employee employee1;

	@BeforeEach
	void setUp() {
    	employee = new Employee(1234, "John Doe", 200000.00,5000);
	    employee1 = new Employee(5678, "Doe", 25000.00,5000);

	}

	@Test
	void NetSalarytest() {
    	assertEquals(280800.00, employee.salary(200000.00), 0.02);
		assertEquals(39300.00, employee1.salary(25000.00), 0.03);
	}
	
	@AfterEach
	void tearDown() {
		employee = null;
	}

}
