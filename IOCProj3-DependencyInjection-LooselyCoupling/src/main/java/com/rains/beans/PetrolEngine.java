package com.rains.beans;

public class PetrolEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine.stopEngine()");

	}

}
