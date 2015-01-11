package com.chapter4._ach.AbstractFactory;

public class CarSedanBMWDealer extends Car {
	PartsFactory partsFactory;
	
	public CarSedanBMWDealer(PartsFactory partsFactory){
		this.partsFactory = partsFactory;
		name = "Original BMW Sedan";
	}
	
	void prepare(){
		carBattery = partsFactory.orderCarBattery();
		suspension = partsFactory.orderSuspension();
		tyres = partsFactory.orderTyres();
	}
	
}
