package org.lessons.java.security;

public class FizzBuzz {
	public static void main(String[] args) {

		int max = 100;
		int i;

		for (i = 1; i <= max; i++) {

			if (((i % 5) == 0) && ((i % 3) == 0)) {
				System.out.println("FizzBuzz");
			} else if ((i % 3) == 0) {
				System.out.println("Fizz");
			} else if ((i % 5) == 0) {
				System.out.println("Buzz");
			}
			System.out.println(i);
		}
	}
}
