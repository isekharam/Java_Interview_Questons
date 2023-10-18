
package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveSptioalCharectorsString {

	public static void main(String[] args) {

		String b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int count = 0;
		ArrayList<Character> al = new ArrayList<>();

		for (int i = 0; i < b.length(); i++) {
			al.add(b.charAt(i));
		}

		String st = "/:x:/p/e009041/EaBH8-PXJv1BhTtSQ9BCxE8BwaUpgVm6c7e-0CSGonudvA?e=4%3AZF4kE8&fromShare=true&at=9";

		for (int i = 0; i < st.length(); i++) {

			if (!al.contains(st.charAt(i)) && !Character.isWhitespace(st.charAt(i))) {
				count++;
				System.out.print(st.charAt(i));

			}
		}

		if (count == 0) {
			System.out.println("No spetial charectors are found");
		} else {
			System.out.println();
			System.out.println("String has spetial chrectors" + " " + count);
		}

	}
}
