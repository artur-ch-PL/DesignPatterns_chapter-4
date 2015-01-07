package com.chapter4._ach.SimplyFactory;

/* 
 * Q. What is advantage of this?  
 * It looks like we are just pushing the problem off to another object.
 * 
 * A. One thing to remember is that the SimpleCarFactory may have many clients.
 * We have only seen orderCar() method, however, there may be DealerCarMenu class, 
 * that uses the factory to get cars for their current description and price.
 * 
 * And, concrete instatiations is removed from client code.
 */


public class SimpleCarFactory {
	public Car createCar(String type){
		Car car;
		
		if(type.equals("Sedan")){
			car = new SedanCar();
		} else if (type.equals("SUV")){
			car = new SuvCar();
		} else {
			System.out.println("Unknown type of car");
			car = null;
		}
		
		return car;
	}
}
