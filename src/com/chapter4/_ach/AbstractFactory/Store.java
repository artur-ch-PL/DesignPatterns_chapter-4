package com.chapter4._ach.AbstractFactory;

public abstract class Store {
	protected abstract Car createCar(String item);
	
	public Car orderCar(String type){
		Car car = createCar(type);
		System.out.println("ORDER BELOW CAR: ");
		car.printName();
		car.prepare();
		return car;
	}
}
