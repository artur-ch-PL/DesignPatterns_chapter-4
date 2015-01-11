package com.chapter4._ach.AbstractFactory;

public class CarSUVPrivateDealer extends Car {
	PartsFactory partsFactory;
	
	public CarSUVPrivateDealer(PartsFactory partsFactory){
		this.partsFactory = partsFactory;
		name = "Custom SUV";
	}
	
	void prepare(){
		carBattery = partsFactory.orderCarBattery();
		suspension = partsFactory.orderSuspension();
		tyres = partsFactory.orderTyres();
	}
}
