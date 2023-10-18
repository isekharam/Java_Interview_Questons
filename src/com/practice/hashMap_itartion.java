

package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap_itartion {

	public static void main(String[] args) {

	HashMap<Integer, String> hm = new HashMap<Integer,String>();
	
	hm.put(1, "Satish");
	hm.put(2, "Sekhar");

	hm.put(3, "Ram");
	hm.put(4, "Charan");
	hm.put(5, "Mahesh");
	

	for(Map.Entry<Integer, String> entry : hm.entrySet()) {
		
		System.out.println("Key :"+" "+entry.getKey() + " "+"Value :"+" "+" "+entry.getValue());
	}
	
	//Secund method 
	
	Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
	
	while(it.hasNext()) {
		
		Map.Entry<Integer, String> entry = it.next();
		
		System.out.println(entry.getKey()+" "+entry.getValue());
	}

	}

}
