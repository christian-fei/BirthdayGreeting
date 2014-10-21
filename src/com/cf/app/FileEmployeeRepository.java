package com.cf.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileEmployeeRepository implements EmployeeRepository {

	private EmployeeFinder employeeFinder = new EmployeeFinder(new ArrayList<Employee>());
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public void loadFromFile(String fileLocation) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileLocation));
		String line;
		while ((line = br.readLine()) != null) {
			String[] prop = line.split(",");
			String name = prop[0];
			String email = prop[1];
			int dayOfBirth = Integer.parseInt(prop[2].trim());
			int monthOfBirth = Integer.parseInt(prop[3].trim());
			employees .add(new Employee(name, email, dayOfBirth, monthOfBirth));
		}
	}

	@Override
	public ArrayList<Employee> findEmployeesBornOn(int day, int month) {
		return employeeFinder.findEmployeesBornOn(day, month);
	}

	@Override
	public void add(Employee employee) {
	}

}
