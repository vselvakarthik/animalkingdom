package com.singtel.digital.service;

public class Bird extends Animal {

	private boolean flyable = true;
	
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

	/**
	 * Makes bird sing
	 */
	public String sing() {
		if (customSong != null) {
			System.out.println("I am singing " + customSong);
			return "Sung " + customSong;
		}
		System.out.println("I am singing");
		return "Sung default";
	}
}
