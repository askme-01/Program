package com.java.reverse.number;

public class StaticMethod {

	public static void main(String[] args) {
		
		int num = 11223344;
		
		System.out.println("Reverse of the Number is :" + reverse(num));

	}
	
	public static int reverse(int n) {
		int remainder = 0;
		int reverse = 0;
		while(n != 0) {
			remainder = n%10;
			reverse = (reverse*10)+remainder;
			n=n/10;
		}
		return reverse;
	}

}
