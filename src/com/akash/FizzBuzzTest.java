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
	
	@Test
	void testForMultipleOf3() {
		assertAll("Test for Multiple of 3 Only", 
				() -> assertEquals("Fizz", FizzBuzzImpl.getResult(6), "This Should return Fizz"),
				() -> assertEquals("Fizz", FizzBuzzImpl.getResult(12), "This Should return Fizz"),
				() -> assertEquals("Fizz", FizzBuzzImpl.getResult(24), "This Should return Fizz"),
				() -> assertEquals("Fizz", FizzBuzzImpl.getResult(66), "This Should return Fizz"),
				() -> assertEquals("Fizz", FizzBuzzImpl.getResult(99), "This Should return Fizz"));
	}
	
	@Test
	void testFor5() {
		assertEquals("Buzz", FizzBuzzImpl.getResult(5), "This Should return Buzz");
	}
	
	@Test
	void testForMultipleOf5() {
		assertAll("Test for Multiple of 5 Only", 
				() -> assertEquals("Buzz", FizzBuzzImpl.getResult(5), "This Should return Buzz"),
				() -> assertEquals("Buzz", FizzBuzzImpl.getResult(10), "This Should return Buzz"),
				() -> assertEquals("Buzz", FizzBuzzImpl.getResult(20), "This Should return Buzz"),
				() -> assertEquals("Buzz", FizzBuzzImpl.getResult(50), "This Should return Buzz"),
				() -> assertEquals("Buzz", FizzBuzzImpl.getResult(100), "This Should return Buzz"));
	}
	
}
