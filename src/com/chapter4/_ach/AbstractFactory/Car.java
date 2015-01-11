package com.chapter4._ach.AbstractFactory;

abstract public class Car {
	String name;
	
	//below elements will be realize by PartsFactory
	public CarBattery carBattery;
	public Suspension suspension;
	public Tyres tyres;
	
	
	public void printName(){
		System.out.println("Car type:\t" + name); 
	}
	
	abstract void prepare();
	
}
