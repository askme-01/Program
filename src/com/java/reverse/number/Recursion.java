package com.java.reverse.number;

public class Recursion {
	
	static int reverse=0;

	public static void main(String[] args) {
		
		int num = 123456;
	    reverse(num);

	}
	
	public static void reverse(int n) {
	
		int remainder = 0;
		
	     if(n != 0) {
	    	 remainder = n%10;
	    	 reverse = (reverse*10)+remainder;
	    	 n = n/10;
	    	 reverse(n);
		}else {
			System.out.println("Reverse of the Number is :" + reverse);
		}
	    
	}

}
