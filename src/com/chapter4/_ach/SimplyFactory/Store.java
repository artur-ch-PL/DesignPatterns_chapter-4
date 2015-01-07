package com.chapter4._ach.SimplyFactory;

public class Store {
	SimpleCarFactory scf;

	public Store(SimpleCarFactory simpleCarFactory) {
		this.scf = simpleCarFactory;
	}

	Car orderCar(String type) {
		/*
		 * WHY below NEW is BAD?
		 * 
		 * Due creating here concrete class, code would not be 'closed for
		 * modification'. Each new class will cause reopen this part of code and
		 * modify it.
		 * 
		 * Car car;
		 * if(type.equals("Sedan")) { 
		 * 	return new Sedan(); 
		 * } else if(type.equals("SUV")){ 
		 * 	return new Suv(); 
		 * } else {
		 * 	System.out.println("Unknown type of car"); 
		 * 	return null; 
		 * }
		 */
		Car car;
		
		car = scf.createCar(type);
		
		car.getName();
		car.mountWheels();
		car.printDoorsNumber();
		
		return car;
	}
	
	
}
