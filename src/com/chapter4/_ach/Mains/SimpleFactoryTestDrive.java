package com.chapter4._ach.Mains;

import com.chapter4._ach.SimplyFactory.SimpleCarFactory;
import com.chapter4._ach.SimplyFactory.Store;

public class SimpleFactoryTestDrive {

	public static void main(String[] args) {
		System.out.println("Simple Factory Example");
		System.out.println("--------------------------");
		
		SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
		Store store = new Store(simpleCarFactory);
		
		store.orderCar("SUV");
		store.orderCar("Sedan");
		try {
			store.orderCar("??");
		} catch (Exception e) {
			System.out.println("ERROR\tException: " + e);
		}
		
	}

}
