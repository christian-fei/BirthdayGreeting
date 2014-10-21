package com.cf.app;

import java.util.ArrayList;
import java.util.Iterator;

public class MemoryEmployeeRepository implements EmployeeRepository {

	private ArrayList<Employee> employees = new ArrayList<Employee>();

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
		this.employees.add(employee);
	}

}
