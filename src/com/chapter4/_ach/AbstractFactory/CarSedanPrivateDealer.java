package com.chapter4._ach.AbstractFactory;

public class CarSedanPrivateDealer extends Car{
	PartsFactory partsFactory;
	
	public CarSedanPrivateDealer(PartsFactory partsFactory){
		this.partsFactory = partsFactory;
		name = "Custom Sedan";
	}
	
	void prepare(){
		carBattery = partsFactory.orderCarBattery();
		suspension = partsFactory.orderSuspension();
		tyres = partsFactory.orderTyres();
	}
}
