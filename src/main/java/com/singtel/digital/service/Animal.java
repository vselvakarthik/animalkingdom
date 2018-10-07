package com.singtel.digital.service;

public class Animal {

	private boolean swimmable = false;
	private boolean canSing = false;
	private boolean canWalk = true;
	protected String customSong = null;
	private AnimalSize size = null;
	private AnimalColour colour = null;
	
	public AnimalSize getSize() {
		return size;
	}

	public void setSize(AnimalSize size) {
		this.size = size;
	}

	public AnimalColour getColour() {
		return colour;
	}

	public void setColour(AnimalColour colour) {
		this.colour = colour;
	}

	public boolean canSwim() {
		return swimmable;
	}
	
	public void setSwimmable(boolean swimmable) {
		this.swimmable = swimmable;
	}
	
	public String getCustomSong() {
		return customSong;
	}

	public void setCustomSong(String customSong) {
		setCanSing(true);
		this.customSong = customSong;
	}

	public boolean canWalk() {
		return canWalk;
	}
	
	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}
	
	/**
	 * Makes animal walk
	 */
	public boolean walk() {
		if (canWalk) {
			System.out.println("I am walking");
			return true;
		}
		return false;
	}
	
	public boolean canSing() {
		return canSing;
	}
	
	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}
	
	/**
	 * Makes animal sing
	 */
	public String sing() {
		if (!canSing)
			return null;
		if (customSong != null) {
			System.out.println("I am singing " + customSong);
			return "Sung " + customSong;
		}
		System.out.println("I am singing");
		return "Sung default";
	}
}
