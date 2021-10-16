package com.immutableclass.mutablefields;

public class Test {
public static void main(String[] args) {


	Student st=new Student(101, "akshay", new Address("chiplun", "maharashtra"));
	
	System.out.println(st);
	
    Address ad1 = st.getAddress();
    ad1.setCity("pune");
    ad1.setState("Delhi");
    System.out.println(st);
}
}
