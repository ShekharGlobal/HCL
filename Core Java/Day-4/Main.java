package com.hcl.abs;

public class Main {

	public static void main(String[] args) {
		
		Car c1= new Maruti();
		Car c2= new Hyundai();
		
		c1.setYear("2021");
		c2.setYear("2022");
		
		c1.getDrive();
		c1.milage();
		c2.getDrive();
		c2.milage();
		
		System.out.println("Maruti Year: "+ c1.getYear());
		System.out.println("Hyundai Year: "+ c2.getYear());
	}

}
