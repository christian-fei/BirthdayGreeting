package com.cf.app;

public class Employee {

	private String name;
	private int dayOfBirth;
	private int monthOfBirth;

	public Employee(String name, int dayOfBirth, int monthOfBirth) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.dayOfBirth = monthOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public boolean bornOn(int dayOfBirth, int monthOfBirth) {
		return dayOfBirth==this.dayOfBirth && monthOfBirth==this.monthOfBirth;
		// TODO Auto-generated method stub
		
	}

}