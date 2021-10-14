package com.java.fibonacciSeries;

public class StaticMethod_WhileLoop {

	public static void main(String[] args) {
		
		int count = 10;
		
		fibonacci(count);
	}
	
	static void fibonacci(int n) {
		
		int n1=0, n2=1, n3;
		int counter=0;
		
		while(counter<n) {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2=n3;
			counter++;
		}
	}

}
