package com.chapter4._ach.FactoryMethod;

public class PrivateDealerStore extends Store {

	@Override
	Car createCar(String type) {
		if(type == "Sedan"){
			return new SedanPrivateDealerCar();
		} else if (type == "SUV"){
			return new SUVPrivateDealerCar();
		} else {
			return null;
		}
		
	}

}
