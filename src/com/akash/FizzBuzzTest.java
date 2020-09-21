package com.akash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testFor1() {
		assertEquals("1", FizzBuzzImpl.getResult(1), "This Should return 1");
	}
	
	@Test
	void testFor2() {
		assertEquals("2", FizzBuzzImpl.getResult(2), "This Should return 2");
	}
	
	@Test
	void testFor3() {
		assertEquals("Fizz", FizzBuzzImpl.getResult(3), "This Should return Fizz");
	}

}
