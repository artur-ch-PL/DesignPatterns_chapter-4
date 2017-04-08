package com.chapter4._ach.FactoryMethod;

import com.chapter4._ach.AbstractFactory.PartsFactory;
import com.chapter4._ach.AbstractFactory.PartsFactoryBMWDealer;

public class StoreBMWDealer extends Store {

	@Override
	public
	Car createCar(String type) {
		@SuppressWarnings("unused")
		PartsFactory partsFactory = new PartsFactoryBMWDealer();
		if(type.equals("Sedan")){
			return new CarSedanBMWDealer();
		} else if (type.equals("SUV")){
			return new CarSUVBMWDealer();
		} else {
			return null;
		}
	}

}
