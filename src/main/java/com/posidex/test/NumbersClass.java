package com.posidex.test;

import java.util.TreeSet;

public class NumbersClass {

	public static void m1() {
		System.out.println("m1 method called");
	}

	public static void main(String []args) {
		
		
		

		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("aa");
		ts.add("cc");
		ts.add("bb");
		
		ts.stream().forEach(System.out::println);
		
		System.out.println("+++++++++++++++++");
		
		for(String e:ts) {
			System.out.println(e);
		}
	}

}




