package com.cf.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileEmployeeRepository implements EmployeeRepository {

	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void loadFromFile(String fileLocation) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileLocation));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.printf("read %s\n", line);
			String[] prop = line.split(",");
			String name = prop[0];
			String email = prop[1];
			int dayOfBirth = Integer.parseInt(prop[2].trim());
			int monthOfBirth = Integer.parseInt(prop[3].trim());
			Employee employee = new Employee(name, email, dayOfBirth, monthOfBirth);
			employees.add(employee);
		}
	}

	@Override
	public ArrayList<Employee> findEmployeesBornOn(int day, int month) {
		ArrayList<Employee> employeesBornOn = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if( employee.bornOn(day,month) )
				employeesBornOn.add(employee);
		}
		return employeesBornOn;
	}

	@Override
	public void add(Employee employee) {
	}

}
