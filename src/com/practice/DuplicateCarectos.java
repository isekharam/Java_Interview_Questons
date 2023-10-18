
package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCarectos {

	public static void main(String[] args) {

		String name = "/:x:/p/e009041/EaBH8-PXJv1BhTtSQ9BCxE8BwaUpgVm6c7e-0CSGonudvA?e=4%3AZF4kE8&fromShare=true&at=9";
		int len = name.length();
		char[] arr = name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char ct : arr) {

			if (map.containsKey(ct)) {

				int count = map.get(ct);
				count = count + 1;
				map.put(ct, count);
			} else {
				map.put(ct, 1);
			}
		}

		for (char c : map.keySet()) {
			int count = map.get(c);
			if (count > 1) {
				System.out.println(c + " " + count);
			}
		}

	}

}
