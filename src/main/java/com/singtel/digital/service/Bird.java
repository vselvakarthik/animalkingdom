package com.singtel.digital.service;

public class Bird extends Animal {

	private boolean flyable = true; // By default birds can fly
	
	public Bird() {
		// By default birds can sing
		setCanSing(true);
	}
	
	public boolean canFly() {
		return flyable;
	}
	
	public void setFlyable(boolean flyable) {
		this.flyable = flyable;
	}

	/**
	 * Makes bird fly
	 */
	public boolean fly() {
		if (flyable) {
			System.out.println("I am flying");
			return true;
		}
		return false;
	}

}
