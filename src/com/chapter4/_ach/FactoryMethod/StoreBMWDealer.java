package com.chapter4._ach.FactoryMethod;

public class StoreBMWDealer extends Store {

	@Override
	public
	Car createCar(String type) {
		if(type == "Sedan"){
			return new CarSedanBMWDealer();
		} else if (type == "SUV"){
			return new CarSUVBMWDealer();
		} else {
			return null;
		}
	}

}
