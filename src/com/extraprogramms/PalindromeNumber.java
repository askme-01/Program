package com.extraprogramms;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	int temp=num;
	int rem,result=0;
	while(temp!=0)
	{
		rem=temp%10;
		result=(result*10)+rem;
		temp=temp/10;
	}
	if(result==num)
	{
		System.out.println("Number is Palindrome");
	}
	else
	{
		System.out.println("Number is not Palindrome");
	}
	
}
}
