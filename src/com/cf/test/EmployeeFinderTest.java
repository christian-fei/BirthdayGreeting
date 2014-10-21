package com.cf.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.cf.app.Employee;
import com.cf.app.EmployeeFinder;

public class EmployeeFinderTest {

	private EmployeeFinder employeeFinder;
	private Employee employee1;
	private Employee employee2;

	@Before
	public void setUp() throws Exception {
		employee1 = new Employee("Christian Fei", "test@gmail.com", 7, 1);
		employee2 = new Employee("Test Test", "test@gmail.com", 31, 12);
		employeeFinder = new EmployeeFinder( new ArrayList<Employee>() {{
			add( employee1 );
			add( employee2 );
		}} );
	}

	@Test
	public void test() {
		ArrayList<Employee> employeesBornOn = employeeFinder.findEmployeesBornOn(7, 1);
		assertEquals(employeesBornOn, new ArrayList<Employee>() {{
			add( employee1 );
		}});
	}

}
