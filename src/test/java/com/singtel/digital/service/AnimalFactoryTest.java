package com.singtel.digital.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalFactoryTest {

	@Test
	void testCreateDuck() {
		Bird duck = AnimalFactory.createDuck();
		assertNotNull(duck);
		assertTrue(duck.fly());
		assertTrue(duck.canSwim());
		assertEquals("Sung Quack, quack", duck.sing());
	}

	@Test
	void testCreateChicken() {
		Bird chicken = AnimalFactory.createChicken();
		assertNotNull(chicken);
		assertFalse(chicken.fly());
		assertFalse(chicken.canSwim());
		assertEquals("Sung Cluck, cluck", chicken.sing());
	}

	@Test
	void testCreateRooster() {
		Bird rooster = AnimalFactory.createRooster();
		assertNotNull(rooster);
		assertFalse(rooster.fly());
		assertFalse(rooster.canSwim());
		assertEquals("Sung Cock-a-doodle-doo", rooster.sing());
	}

	@Test
	void testCreateParrotString() {
		String song = "Tring Tring";
		Bird parrot = AnimalFactory.createParrot(song);
		assertNotNull(parrot);
		assertTrue(parrot.fly());
		assertFalse(parrot.canSwim());
		assertEquals("Sung " + song, parrot.sing());
	}

	@Test
	void testCreateParrotAnimal() {
		Animal dog = new Animal();
		dog.setCustomSong("woof woof");
		Bird parrot = AnimalFactory.createParrot(dog);
		assertNotNull(parrot);
		assertTrue(parrot.fly());
		assertFalse(parrot.canSwim());
		assertEquals("Sung woof woof", parrot.sing());
	}

}
