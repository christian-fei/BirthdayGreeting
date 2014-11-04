package com.cf.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cf.app.BirthdayService;
import com.cf.app.DummyEmailService;
import com.cf.app.Employee;
import com.cf.app.EmployeeRepository;
import com.cf.app.MemoryEmployeeRepository;

public class BirthdayServiceTest {

	private BirthdayService birthdayService;
	private EmployeeRepository employeeRepository;
	private DummyEmailService emailService;

	@Test
	public void testCollaboration() {
		employeeRepository = new MemoryEmployeeRepository();
		employeeRepository.add(new Employee("Christian Fei", "christian@fei.ninja", 7, 1));
		
		emailService = new DummyEmailService();
		
		birthdayService = new BirthdayService(employeeRepository, emailService);
		birthdayService.sendGreetingsToEmployeesBornOn(7, 1);
		
	}

}
