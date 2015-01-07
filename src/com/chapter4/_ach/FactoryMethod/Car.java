package com.chapter4._ach.FactoryMethod;

abstract public class Car {
	String name;
	String wheelSize;
	int doorsNumber;
	
	public String getName(){
		return "Car type:" + name;
	}
	
	public void mountWheels(){
		System.out.println("Wheels get size:\t" + wheelSize);
	}
	
	public void printDoorsNumber(){
		System.out.println("Number of doors in the car:\t" + doorsNumber);
	}
	
}
