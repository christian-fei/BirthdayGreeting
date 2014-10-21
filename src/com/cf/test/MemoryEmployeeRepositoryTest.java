package com.cf.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.cf.app.Employee;
import com.cf.app.EmployeeRepository;
import com.cf.app.MemoryEmployeeRepository;

public class MemoryEmployeeRepositoryTest {

	private EmployeeRepository employeeRepository;
	private Employee employee1;
	private Employee employee2;

	@Before
	public void setUp() throws Exception {
		employeeRepository = new MemoryEmployeeRepository();
		employee1 = new Employee("Christian Fei", "test@gmail.com", 7, 1);
		employee2 = new Employee("Test Test", "test@gmail.com", 31, 12);
		employeeRepository.add(employee1);
		employeeRepository.add(employee2);
	}

	@Test
	public void testFindsEmployeeByDayAndMonth() {
		ArrayList<Employee> employees = employeeRepository.findEmployeesBornOn(7, 1);
		assertEquals(employees, new ArrayList<Employee>(){{
			add(employee1);
		}});
		employees = employeeRepository.findEmployeesBornOn(31, 12);
		assertEquals(employees, new ArrayList<Employee>(){{
			add(employee2);
		}});
	}

}
