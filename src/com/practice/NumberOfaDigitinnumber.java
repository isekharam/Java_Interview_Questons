 package com.practice;

public class NumberOfaDigitinnumber {

	public static void main(String[] args) {

		int number = 1234;
		int count = 0;
		while (number > 0) {
			
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}

}
