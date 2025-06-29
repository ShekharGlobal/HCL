package com.coforge.exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		int result=0;
		Demo d1= new Demo();
		try {
		d1.dividend=8;
		d1.divisor=0;
		
		result= d1.division();
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception" +e.getMessage());
		
		}
		finally {
			
			System.out.println(result);
		}

	}

}
