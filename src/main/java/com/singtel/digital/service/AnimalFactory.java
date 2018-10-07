package com.singtel.digital.service;

public class AnimalFactory {

	public static Bird createDuck() {
		Bird duck = new Bird();
		duck.setFlyable(true);
		duck.setSwimmable(true);
		duck.setCustomSong("Quack, quack");
		return duck;
	}

	public static Bird createChicken() {
		Bird chicken = new Bird();
		chicken.setFlyable(false);
		chicken.setSwimmable(false);
		chicken.setCustomSong("Cluck, cluck");
		return chicken;
	}

	public static Bird createRooster() {
		Bird rooster = createChicken();
		rooster.setCustomSong("Cock-a-doodle-doo");
		return rooster;
	}

	/**
	 * Creates a parrot that can sing a given song
	 * @param song For Parrot to sing
	 * @return Instance of Parrot
	 */
	public static Bird createParrot(String song) {
		Bird parrot = new Bird();
		parrot.setFlyable(true);
		parrot.setSwimmable(false);
		parrot.setCustomSong(song);
		return parrot;
	}

	/**
	 * Creates Parrot that can sing same song as the friend animal
	 * @param friend Animal that is friend of Parrot
	 * @return Parrot that sings animal song
	 */
	public static Bird createParrot(Animal friend) {
		Bird parrot = createParrot(friend.getCustomSong());
		return parrot;
	}

}
