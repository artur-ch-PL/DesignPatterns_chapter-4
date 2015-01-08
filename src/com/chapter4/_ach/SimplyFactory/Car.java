package com.chapter4._ach.SimplyFactory;

abstract public class Car {
	String name;
	String wheelSize;
	int doorsNumber;
	
	public void printName(){
		System.out.println("Car type:\t" + name); 
	}
	
	public void printWheelSize(){
		System.out.println("Wheels get size:\t" + wheelSize);
	}
	
	public void printDoorsNumber(){
		System.out.println("Number of doors in the car:\t"+doorsNumber);
	}
	
}
