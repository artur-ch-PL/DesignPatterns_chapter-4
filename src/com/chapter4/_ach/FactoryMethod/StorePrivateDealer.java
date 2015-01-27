package com.chapter4._ach.FactoryMethod;

public class StorePrivateDealer extends Store {

	@Override
	public
	Car createCar(String type) {
		if(type.equals("Sedan")){
			return new CarSedanPrivateDealer();
		} else if (type.equals("SUV")){
			return new CarSUVPrivateDealer();
		} else {
			return null;
		}
		
	}

}
