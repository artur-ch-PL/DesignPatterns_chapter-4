package com.chapter4._ach.AbstractFactory;

public interface PartsFactory {
	 CarBattery orderCarBattery();
	 Suspension orderSuspension();
	 Tyres orderTyres();
}
