package com.hcl.abs;

public abstract class Car {
	
	private String year;
	//Method Prototype
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public abstract void milage();
	
	//Non abstract Method
	public void getDrive() {
		System.out.println("cool");
	}

}
