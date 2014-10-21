package com.cf.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cf.app.Employee;

public class EmployeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBornOnSpecificDate() {
		assertEquals(true,true);
		Employee employee = new Employee("Christian Fei", 7, 1);
		assertTrue( employee.bornOn(7,1) );
	}

}
