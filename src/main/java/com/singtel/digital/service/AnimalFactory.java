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
	
	/**
	 * Creates a Shark
	 * @return Shark instance
	 */
	public static Fish createShark() {
		Fish shark = new Fish();
		shark.setCanJoke(false);
		shark.setCanEatFish(true);
		shark.setColour(AnimalColour.GREY);
		shark.setSize(AnimalSize.LARGE);
		return shark;
	}

	/**
	 * Creates clown fish
	 * @return Clown Fish instance
	 */
	public static Fish createClownFish() {
		Fish clownFish = new Fish();
		clownFish.setCanJoke(true);
		clownFish.setCanEatFish(false);
		clownFish.setColour(AnimalColour.ORANGE);
		clownFish.setSize(AnimalSize.SMALL);
		return clownFish;
	}
	
	/**
	 * Creates a Dolphin
	 * @return Dolphin instance
	 */
	public static Animal createDolphin() {
		Animal dolphin = new Animal();
		dolphin.setSwimmable(true);
		dolphin.setCanWalk(false);
		dolphin.setCanSing(false);
		return dolphin;
	}

	/**
	 * Creates a Butterfly
	 * @return Butterfly instance
	 */
	public static Animal createCaterpillar() {
		Animal caterpillar = new Animal();
		caterpillar.setSwimmable(false);
		caterpillar.setCanWalk(true);
		caterpillar.setCanSing(false);
		caterpillar.setFlyable(false);
		return caterpillar;
	}

	/**
	 * Metamorphs a Caterpillar Butterfly
	 * @param caterpillar Caterpillar instance
	 * @return Butterfly instance
	 */
	public static void metamorphToButterfly(Animal caterpillar) {
		Animal butterfly = caterpillar;
		butterfly.setSwimmable(false);
		butterfly.setCanWalk(false);
		butterfly.setCanSing(false);
		butterfly.setFlyable(true);
	}

	/**
	 * Creates a Butterfly
	 * @return Butterfly instance
	 */
	public static Animal createButterfly() {
		Animal butterfly = new Animal();
		butterfly.setSwimmable(false);
		butterfly.setCanWalk(false);
		butterfly.setCanSing(false);
		butterfly.setFlyable(true);
		return butterfly;
	}
	
	/**
	 * Creates a Dog
	 * @return Dog instance
	 */
	public static Animal createDog() {
		Animal dog = new Animal();
		dog.setSwimmable(true);
		dog.setCanWalk(true);
		dog.setCustomSong("Woof Woof");
		return dog;
	}
	
	/**
	 * Creates a Cat
	 * @return Cat instance
	 */
	public static Animal createCat() {
		Animal cat = new Animal();
		cat.setSwimmable(false);
		cat.setCanWalk(true);
		cat.setCustomSong("Meow Meow");
		return cat;
	}
	
	/**
	 * Creates a Frog
	 * @return Frog instance
	 */
	public static Animal createFrog() {
		Animal frog = new Animal();
		frog.setSwimmable(true);
		frog.setCanWalk(true);
		frog.setCustomSong("Rebeck Rebeck");
		return frog;
	}
		
	
	public static Animal[] createAll() {
		Animal[] animals = new Animal[] {
				new Bird(), createDuck(), createChicken(), createRooster(), createParrot("key key"),
				new Fish(), createShark(), createClownFish(), createDolphin(),
				createFrog(), createDog(), createButterfly(), createCat()
		};
		return animals;
	}

}
