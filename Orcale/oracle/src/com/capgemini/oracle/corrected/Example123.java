package com.capgemini.oracle.corrected;

import java.time.LocalDate;

public class Example123 {
public static void main(String[] args) {
	LocalDate date = LocalDate.of(2012,01, 31);
	date.plusDays(10);
	System.out.println(date);
}
}
