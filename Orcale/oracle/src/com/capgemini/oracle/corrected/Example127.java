package com.capgemini.oracle.corrected;

import java.util.ArrayList;
import java.util.List;

public class Example127 {
	public static void main(String[] args) {
		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3,"cyan");
		System.out.println(colors);

	}

}
