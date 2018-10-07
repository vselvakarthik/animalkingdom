package com.singtel.digital.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void testWalk() {
		try {
			Animal animal=new Animal();
			animal.walk();
		} catch (Exception e) {
			fail("Execute without error");
		}
	}

}
