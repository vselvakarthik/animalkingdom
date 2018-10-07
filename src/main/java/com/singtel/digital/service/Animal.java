package com.singtel.digital.service;

public class Animal {

	private boolean swimmable = false;
	protected String customSong = null;
	
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
		this.customSong = customSong;
	}

	/**
	 * Makes animal walk
	 */
	public void walk() {
		System.out.println("I am walking");
	}
}
