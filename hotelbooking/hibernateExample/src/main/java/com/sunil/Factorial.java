package com.sunil;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(findFactorial(2));
	}

	private static int findFactorial(int i) {
	
		if(i==0)
			return 1;
		return i*findFactorial(i-1);
	}

}
