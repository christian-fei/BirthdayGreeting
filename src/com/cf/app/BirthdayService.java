package com.cf.app;

import java.util.ArrayList;
import java.util.Iterator;

public class BirthdayService {

	private EmailService emailService;
	private EmployeeRepository employeeRepository;

	public BirthdayService(EmployeeRepository employeeRepository, EmailService emailService) {
		this.employeeRepository = employeeRepository;
		this.emailService = emailService;
	}
	
	public void sendGreetingsToEmployeesBornOn(int day, int month){
		ArrayList<Employee> employees= employeeRepository.findEmployeesBornOn(day, month);
		for (Employee employee : employees) {
			emailService.send(employee.getEmail(), "Happy Birthday!", "Happy Birthday, " + employee.getName() + "!");
		}
	}

}
