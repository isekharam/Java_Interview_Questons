package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String args[]) {

		String str = "this is chat gpt";
		String arr[] = str.split(" ");

		String reversSting = "";

		for (String w : arr) {
			String reverWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {

				reverWord = reverWord + w.charAt(i);
			}
			
			reversSting=reversSting+reverWord+" ";
		}
			System.out.println(reversSting);
	}
}