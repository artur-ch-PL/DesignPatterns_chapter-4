package com.chapter4._ach.FactoryMethod;

public class BMWDealerStore extends Store {

	@Override
	Car createCar(String type) {
		if(type == "Sedan"){
			return new SedanBMWDealerCar();
		} else if (type == "SUV"){
			return new SUVBMWDealerCar();
		} else {
			return null;
		}
	}

}
