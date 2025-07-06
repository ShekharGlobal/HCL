package com.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Zero1 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> b1= (x,y)->x+y;
		System.out.println(b1.apply(5, 5));
		

	}

}
