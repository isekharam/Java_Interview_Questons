package com.practice;

public class Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "12345";
		int b = Integer.parseInt(name);

		System.out.println(b);

		// Second method

		char arr[] = name.toCharArray();
		int total = 0;
		for (Character c : arr) {

			int number = c - '0';
			total = total * 10 + number;
		}
		System.out.println(total);
	}

}
