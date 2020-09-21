package com.akash;

public class FizzBuzzImpl {

	static String getResult(int x) {
		if (x % 3 == 0 && x % 5 == 0) {
			return "FizzBuzz";
		}

		if (x % 3 == 0 || Integer.toString(x).contains("3")) {
			return "Fizz";
		}
		if (x % 5 == 0 || Integer.toString(x).contains("5")) {
			return "Buzz";
		}
		return Integer.toString(x);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getResult(i));
		}
	}
}
