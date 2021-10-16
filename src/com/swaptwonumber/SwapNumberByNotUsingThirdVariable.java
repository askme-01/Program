package com.swaptwonumber;

public class SwapNumberByNotUsingThirdVariable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=b-a;

		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}
}


//Map<String, List<String>> map = new HashMap<>();
//map.computeIfAbsent("key1", k -> new ArrayList<>()).add("value1");
//map.computeIfAbsent("key1", k -> new ArrayList<>()).add("value2"); 
//assertThat(map.get("key1").get(0)).isEqualTo("value1");
//assertThat(map.get("key1").get(1)).isEqualTo("value2");