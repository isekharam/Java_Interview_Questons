 package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareTwoSting {

	public static void main(String[] args) {

		String name1 = "maheshbabu";
		String name2 = "sarath";

		Set<Character> set = new HashSet<>();
		Map<Character, Integer> map = new HashMap<>();

		for (char s1 : name1.toCharArray()) {
			set.add(s1);
		}

		for (char s2 : name2.toCharArray()) {
			if (set.contains(s2)) {

				if (map.containsKey(s2)) {

					int count = map.get(s2);
					count = count + 1;
					map.put(s2, count);
				}else {
					map.put(s2, 1);
				}
			}
		}
		
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
