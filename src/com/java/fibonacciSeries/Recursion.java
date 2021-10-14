package com.java.fibonacciSeries;

public class Recursion {

	public static void main(String[] args) {
		
		int n1=0, n2=1, count = 10;
		
		for(int i=0; i<count; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	
	static int fibonacci(int n) {
		
		if(n<=1)
			return n;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
