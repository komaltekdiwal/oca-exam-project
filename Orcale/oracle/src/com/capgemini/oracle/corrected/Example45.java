package com.capgemini.oracle.corrected;

import java.util.ArrayList;

public class Example45 {
public static void main(String[] args) {
	ArrayList myList = new ArrayList();
	String[] myArray;
	try {
		while(true) {
			myList.add("My string");
		}
	}catch(RuntimeException e) {
		System.out.println("Caught a RuntmeException");
	}catch(Exception e) {
		System.out.println("Caught a exception");
	}
	
	System.out.println("Ready to use");
}
}
