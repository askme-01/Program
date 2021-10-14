package com.immutableclass.mutablefields;

public class Test {
public static void main(String[] args) {

	Address ad=new Address("chiplun", "maharashtra");
	Student st=new Student(101, "akshay", ad);
	
	System.out.println(st);
	
    Address ad1 = st.getAddress();
    ad1.setCity("pune");
    ad1.setState("Delhi");
    System.out.println(st);
}
}
