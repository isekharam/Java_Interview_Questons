package com.practice;

public class ReversastringWithoutchangingthePosition {

	public static void main(String[] args) {

		String str = "somasekhar Meesala";
		String arr[] = str.split(" ");

		String reversString = "";

		for (String w : arr) {
			String reversWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				reversWord = reversWord + w.charAt(i);
			}

			reversString = reversString + reversWord + " ";
		}
		System.out.println(reversString);
	}

}
