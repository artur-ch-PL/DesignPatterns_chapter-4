package com.chapter4._ach.FactoryMethod;

public abstract class Store {
	
	abstract Car createCar(String type);

	public Car orderCar(String type){
		Car car;
		car = createCar(type);
		return car;
	}
		
}
