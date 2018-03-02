package com.sunil;

import java.util.Scanner;

public class FibonacciCalculator {
	static int i1 = 0, i2 = 1, i3 = 0;

	public static void main(String[] args) {
		int fib = new Scanner(System.in).nextInt();

		if (fib >= 0 || fib >= 1)
			System.out.print(i1 + " ");

		if (fib >= 2)
			System.out.print(i2 + " ");

		fibonacci(fib - 2);

	}

	private static void fibonacci(int fib) {
		if (fib > 0) {
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			System.out.print(i3 + " ");
			fibonacci(fib - 1);
		}

	}

}
