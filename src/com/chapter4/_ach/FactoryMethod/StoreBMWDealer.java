package com.chapter4._ach.FactoryMethod;

import com.chapter4._ach.AbstractFactory.PartsFactory;
import com.chapter4._ach.AbstractFactory.PartsFactoryBMWDealer;

public class StoreBMWDealer extends Store {

	@Override
	public
	Car createCar(String type) {
		PartsFactory pf = new PartsFactoryBMWDealer();
		if(type == "Sedan"){
			return new CarSedanBMWDealer();
		} else if (type == "SUV"){
			return new CarSUVBMWDealer();
		} else {
			return null;
		}
	}

}
