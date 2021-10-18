package com.rains.beans;

import java.util.Random;

public class Bat {

	public Bat() {
	System.out.println("Bat. 0 conts");
	}

	int scoreRuns() {
		return new Random().nextInt();
	}

}
