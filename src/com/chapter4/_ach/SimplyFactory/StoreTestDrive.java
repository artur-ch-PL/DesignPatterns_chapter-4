package com.chapter4._ach.SimplyFactory;

public class StoreTestDrive {

	public static void main(String[] args) {
		
		SimpleCarFactory scf = new SimpleCarFactory();
		Store store = new Store(scf);
		store.orderCar("SUV");
		store.orderCar("Sedan");
		
		try {
			store.orderCar("??");
		} catch (Exception e) {
			System.out.println("ERROR\tException: " + e);
		}
		
	}

}
