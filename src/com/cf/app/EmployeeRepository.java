package com.cf.app;

import java.util.ArrayList;

public interface EmployeeRepository {
	public ArrayList<Employee> findEmployeesBornOn(int day, int month);
	public void add(Employee employee);
}
