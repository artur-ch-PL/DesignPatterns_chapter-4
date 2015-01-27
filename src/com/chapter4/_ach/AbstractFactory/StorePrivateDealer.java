package com.chapter4._ach.AbstractFactory;

public class StorePrivateDealer extends Store {
	
	@Override
	public
	Car createCar(String type) {
		PartsFactory pf = new PartsFactoryPrivateDealer();

		if(type.equals("Sedan")){
			return new CarSedanPrivateDealer(pf);
		} else if (type.equals("SUV")){
			return new CarSUVPrivateDealer(pf);
		} else {
			return null;
		}
		
	}

}
