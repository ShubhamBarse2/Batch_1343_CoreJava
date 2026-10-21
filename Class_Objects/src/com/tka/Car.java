package com.tka;

public class Car {

	String carName;
	int modelYr;
	int engineNo;
	int seats;

	public static void engineWorking() {
		System.out.println("Engigne Wokring ");
	}

	public static void interior() {
		System.out.println("interiro releate ");
	}

	public static void stering() {
		System.out.println("stering realrred info");
	}

	public void display() {
		System.out.println("CarName --> " + carName);
		System.out.println("Engigne No --> " + engineNo);
		System.out.println("Model YR --> " + modelYr);
		System.out.println("Seats --> " + seats);
		engineWorking();
		interior();
		stering();
	}
}
