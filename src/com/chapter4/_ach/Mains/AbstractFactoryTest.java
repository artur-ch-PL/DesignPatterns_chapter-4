package com.chapter4._ach.Mains;

import com.chapter4._ach.AbstractFactory.Car;
import com.chapter4._ach.AbstractFactory.Store;
import com.chapter4._ach.AbstractFactory.StoreBMWDealer;
import com.chapter4._ach.AbstractFactory.StorePrivateDealer;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		Store bmwStore = new StoreBMWDealer();
		Store privateStore = new StorePrivateDealer();
		Car car;
		
		car = bmwStore.orderCar("SUV");
		viewCarConstruction(car);
		
		car = privateStore.orderCar("SUV");
		viewCarConstruction(car);
	}
	
	static void viewCarConstruction(Car car){
		System.out.println("Battery:\t" + car.carBattery);
		System.out.println("Suspensions elements:\t" + car.suspension);
		System.out.println("Tyres:\t" + car.tyres);
		System.out.println("============");
	}

}
