package com.chapter4._ach.AbstractFactory;

public class CarSUVBMWDealer extends Car {
	PartsFactory partsFactory;
	
	public CarSUVBMWDealer(PartsFactory partsFactory){
		this.partsFactory = partsFactory;
		name = "Original BMW SUV";
	}
	
	void prepare(){
		carBattery = partsFactory.orderCarBattery();
		suspension = partsFactory.orderSuspension();
		tyres = partsFactory.orderTyres();
	}
}
