package com.capgemini.oracle.corrected;

public class Car7 extends Vehicle7{
	
	String trans;
	
	Car7(String trans){
		this.trans = trans;
	}
	

	Car7(String type, int maxSpeed,String trans) {
		super(type, maxSpeed);
this(trans);
	}

}
