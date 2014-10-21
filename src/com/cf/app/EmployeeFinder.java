package com.cf.app;

import java.util.ArrayList;

public class EmployeeFinder {
	public ArrayList<Employee> employees;

	public EmployeeFinder(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public ArrayList<Employee> findEmployeesBornOn(int day, int month){
		ArrayList<Employee> employeesBornOn = new ArrayList<Employee>();
		for (Employee employee : this.employees) {
			if( employee.bornOn(day,month) )
				employeesBornOn.add(employee);
		}
		return employeesBornOn;
	}
}