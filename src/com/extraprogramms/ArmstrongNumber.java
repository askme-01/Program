package com.extraprogramms;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	while(true)
	{
		int num, original, result, d1, d2, d3;
		int power=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		num = sc.nextInt();
		original=num;
		d1=num%10;
		num=num/10;
		
		d2=num%10;
		num=num/10;
		
		d3=num%10;
		
		result=(int) (Math.pow(d1, power)+Math.pow(d2, power)+Math.pow(d3, power));

		 if(result == original)
		 {
			 System.out.println("Number is Armstrong no.");
		 }
		 else
		 {
			 System.out.println("Number is not Armstrong no.");
		 }
	}
	
}
}
