package com.chapter4._ach.FactoryMethod;

public abstract class Store {
	
	public abstract Car createCar(String type);

	public Car orderCar(String type){
		Car car;
		car = orderCar(type);
		return car;
	}
		
}
