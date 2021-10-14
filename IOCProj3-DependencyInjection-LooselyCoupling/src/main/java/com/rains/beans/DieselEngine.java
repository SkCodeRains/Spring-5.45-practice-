package com.rains.beans;

public class DieselEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine.stopEngine()");

	}

}
