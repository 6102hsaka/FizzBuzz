package com.akash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testFor1() {
		assertEquals("1", FizzBuzzImpl.getResult(1), "This Should return 1");
	}

}
