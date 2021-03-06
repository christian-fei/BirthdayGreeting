package com.cf.app;

public class Employee {

	private String name;
	private String email;
	private int dayOfBirth;
	private int monthOfBirth;

	public Employee(String name, String email, int dayOfBirth, int monthOfBirth) {
		this.name = name;
		this.setEmail(email);
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
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
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
