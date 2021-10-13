package com.java.reverse.number;

public class WhileLoop {

	public static void main(String[] args) {
		
		int num = 123456;
		int remainder = 0;
		int reverse = 0;
		
		while(num != 0) {
			remainder = num%10;
			reverse = (reverse*10)+remainder;
			num=num/10;
		}
		System.out.println("Reverse of the Number is :" + reverse);
	}

}
