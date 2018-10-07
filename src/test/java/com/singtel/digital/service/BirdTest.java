package com.singtel.digital.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BirdTest {
	
	@Test
	void testFly() {
		Bird bird = new Bird();
		try {
			boolean result = bird.fly();
			assertTrue(result);
		} catch (Exception e) {
			fail("Execute without error");
		}
	}

	@Test
	void testSing() {
		Bird bird = new Bird();
		try {
			String result = bird.sing();
			assertNotNull(result);
		} catch (Exception e) {
			fail("Execute without error");
		}
	}
	
	/*
	@Test
	void testHi() {
		Bird bird = new Bird();
		String result = bird.hi("hi");
		assertNotNull(result);
		assertEquals("hi hi", result);
		assertEquals("hi", bird.hi(""));
		System.out.println("Test");
	}
	*/

}
