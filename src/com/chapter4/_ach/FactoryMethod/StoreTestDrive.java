package com.chapter4._ach.FactoryMethod;

public class StoreTestDrive {

	public static void main(String[] args) {
		Store bmwDealerStore = new BMWDealerStore();
		Store privateDealerStore = new PrivateDealerStore();
		
		Car car;
		
		car = bmwDealerStore.createCar("SUV");
		car.printName();
		
		car = privateDealerStore.createCar("SUV");
		car.printName();
	}

}
