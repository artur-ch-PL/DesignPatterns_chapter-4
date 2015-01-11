package com.chapter4._ach.AbstractFactory;

public class PartsFactoryPrivateDealer implements PartsFactory {

	@Override
	public CarBattery orderCarBattery() {
		return new CarBatteryVarta();
	}

	@Override
	public Suspension orderSuspension() {
		return new SuspensionDanmarkSilencer();
	}

	@Override
	public Tyres orderTyres() {
		return new TyresKormoran();
	}


}
