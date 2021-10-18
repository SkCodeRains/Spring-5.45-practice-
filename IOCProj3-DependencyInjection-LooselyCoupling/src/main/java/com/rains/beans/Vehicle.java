package com.rains.beans;

public class Vehicle {
	Engine e;

	public Vehicle(Engine e) {
		System.out.println("Vehicle 1-PARAM CONSTRUCTOR");
		this.e = e;
	}

	public void startEngine() {
		System.out.println("Vehicle.startEngine()");
		e.startEngine();
	}

	public void stopEngine() {
		System.out.println("Vehicle.stopEngine()");
		e.stopEngine();
	}

	public void move(String start, String stop) {
		System.out.println("Vehicle.move()");
		System.out.println("Journey started from : " + start);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Journey ended at :  " + stop);
	}
}
