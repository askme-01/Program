package com.singletondesignpattern;


public class Test {
public static void main(String[] args)
{
	Singleton singleton1 = Singleton.getInstance();
	System.out.println(singleton1.hashCode());
	
	Singleton singleton2 = Singleton.getInstance();
	System.out.println(singleton2.hashCode());
	
}
}
