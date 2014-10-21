package com.cf.app;

import java.util.ArrayList;
import java.util.Iterator;

public class MemoryEmployeeRepository implements EmployeeRepository {

	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private EmployeeFinder employeeFinder;

	@Override
	public ArrayList<Employee> findEmployeesBornOn(int day, int month) {
		return employeeFinder.findEmployeesBornOn(day, month);
	}

	@Override
	public void add(Employee employee) {
		this.employees.add(employee);
		employeeFinder = new EmployeeFinder(this.employees);
	}

}
