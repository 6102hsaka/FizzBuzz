package com.akash;

public class FizzBuzzImpl {

	static String getResult(int x) {
		if (x % 3 == 0) {
			return "Fizz";
		}
		if (x % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(x);
	}
}
