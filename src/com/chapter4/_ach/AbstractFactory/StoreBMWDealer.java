package com.chapter4._ach.AbstractFactory;

public class StoreBMWDealer extends Store {
	
	@Override
	public
	Car createCar(String type) {
		PartsFactory partsFactory = new PartsFactoryBMWDealer();
		if(type.equals("Sedan")){
			return new CarSedanBMWDealer(partsFactory);
		} else if (type.equals("SUV")){
			return new CarSUVBMWDealer(partsFactory);
		} else {
			return null;
		}
	}

}
