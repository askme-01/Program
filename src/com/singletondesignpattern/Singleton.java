package com.singletondesignpattern;

public class Singleton {
private static Singleton Instance=new Singleton();
 
private Singleton()
{
	
}


public static Singleton getInstance()
{
	if(Instance==null) {
		return Instance=new Singleton();
	}
	
	return Instance;
}
}
