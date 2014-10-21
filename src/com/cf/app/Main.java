package com.cf.app;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileEmployeeRepository employeeRepository = new FileEmployeeRepository();
		employeeRepository.loadFromFile("employees.txt");
		ArrayList<Employee> employeesBornOn = employeeRepository.findEmployeesBornOn(7, 1);
		System.out.println( employeesBornOn );
	}

}
