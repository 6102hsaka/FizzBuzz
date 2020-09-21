package com.akash;

public class FizzBuzzImpl {

	static String getResult(int x) {
		if(x==3) {
			return "Fizz";
		}
		return Integer.toString(x);
	}
}
