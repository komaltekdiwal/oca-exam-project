package com.capgemini.oracle.corrected;

public class Example80 {
public static void main(String[] args) {
	try {
		int n = 10;
		int d=0;
		int ans = n/d;
	}catch(ArithmeticException ae) {
		ans = 0;
	}catch(Exception e) {
		System.out.println("Invalid calculation");
	}
	
	System.out.println("Answer="+ans);
}
}
