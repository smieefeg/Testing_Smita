package com.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ABC");
		map.put(2, "PQR");
		map.put(3, "AAA");
		
	Set<Integer>	keys = map.keySet();
	
	keys.forEach(n->{
	String s =	map.get(n);
	System.out.println(s);
	});
	
	for(Integer key:keys) {
	String s =	map.get(key);
	System.out.println(s);
	}
	}
	


}
