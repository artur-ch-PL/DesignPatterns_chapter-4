package com.chapter4._ach.Mains;

import com.chapter4._ach.FactoryMethod.StoreBMWDealer;
import com.chapter4._ach.FactoryMethod.Car;
import com.chapter4._ach.FactoryMethod.StorePrivateDealer;
import com.chapter4._ach.FactoryMethod.Store;

public class FactoryMethodTestDrive {

	public static void main(String[] args) {
		System.out.println("Method Factory Example");
		System.out.println("--------------------------");
		
		Store bmwDealerStore = new StoreBMWDealer();
		Store privateDealerStore = new StorePrivateDealer();
		
		Car car;
		
		car = bmwDealerStore.createCar("SUV");
		car.printName();
		
		car = privateDealerStore.createCar("SUV");
		car.printName();
	}

}
