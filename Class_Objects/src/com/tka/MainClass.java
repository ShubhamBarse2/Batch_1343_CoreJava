package com.tka;

public class MainClass {

	public static void main(String[] args) {

		Car bmw = new Car();
		bmw.carName ="BMW"; 
		bmw.engineNo = 23456765;
		bmw.modelYr = 2026;
		bmw.seats = 5;
		bmw.display();
		System.out.println("----------------------------------------");

//		Car alto = new Car();
//
//		System.out.println("CarName --> " + (bmw.carName = "Alto"));
//		System.out.println("Engigne No --> " + (bmw.engineNo = 8765432));
//		System.out.println("Model YR --> " + (bmw.modelYr = 2017));
//		System.out.println("Seats --> " + (bmw.seats = 4));
//		bmw.engineWorking();
//		bmw.interior();
//		bmw.stering();

//		Car square = new Car();
//
//		System.out.println("CarName --> " + (square.carName = "Square"));
//		System.out.println("Engigne No --> " + (square.engineNo = 8765432));
//		System.out.println("Model YR --> " + (square.modelYr = 2027));
//		System.out.println("Seats --> " + (square.seats = 5));
//		square.engineWorking();
//		square.interior();
//		square.stering();
	}

}
