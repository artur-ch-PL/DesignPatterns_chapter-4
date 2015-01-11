package com.chapter4._ach.AbstractFactory;

public class PartsFactoryBMWDealer implements PartsFactory {

	@Override
	public CarBattery orderCarBattery() {
		return new CarBatteryBosh();
	}

	@Override
	public Suspension orderSuspension() {
		return new SuspensionBoshSilencer();
	}

	@Override
	public Tyres orderTyres() {
		return new TyresBarum();
	}


}
