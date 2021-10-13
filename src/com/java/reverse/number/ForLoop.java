package com.java.reverse.number;

public class ForLoop {
	
	//We can call this technique as Using Function......

	public static void main(String[] args) {
		
		int num = 56789;
		
		int remainder = 0;
		int reverse = 0;
		
		for(;num != 0;) {
			remainder = num%10;
			reverse = (reverse*10)+remainder;
			num = num/10;
		}
		
		System.out.println("Reverse of the Number is :" + reverse);

	}

}
