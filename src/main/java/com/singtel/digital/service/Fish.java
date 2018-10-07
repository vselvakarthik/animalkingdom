package com.singtel.digital.service;

public class Fish extends Animal {
	
	private boolean canJoke = false;
	private boolean canEatFish = false;
	
	public Fish() {
		// By default fishes can swim
		setSwimmable(true);
		setCanWalk(false);
		setCanSing(false);
		
	}

	public boolean canJoke() {
		return canJoke;
	}

	public void setCanJoke(boolean canJoke) {
		this.canJoke = canJoke;
	}

	public boolean canEatFish() {
		return canEatFish;
	}

	public void setCanEatFish(boolean canEatFish) {
		this.canEatFish = canEatFish;
	}

}
