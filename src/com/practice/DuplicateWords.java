package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {

		String str = "selenum is good and it i good testing tool vety good";
		String s[] = str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String at : s) {
			
			if(map.containsKey(at)) {
				
				int count = map.get(at);
				count=count+1;
				map.put(at, count);
			}
			else {
				map.put(at, 1);
			}
		}
		
	  for(String s1: map.keySet())
	  {
		 int count=map.get(s1);
		 if(count>1)
		 {
			 System.out.println(s1+" "+count);
		 }
	  }
	}

}
