package com.practice;

public class OnlyNumaricalValusaFromString {

	public static void main(String[] args) {

		// String b =
		// "abcdefg2hijklmnopqrstuvwxyzABCDEFGHI6JKLMNOPQRSTUVWXYZ0123456789";

		String s = "adf5hgjyu1frdsff6vgyu7bnjh9asd3";
		char[] sarr = s.toCharArray();

		for (int i = 0; i < sarr.length; i++) {

			if (sarr[i] / 1>= 48 && sarr[i] / 1<= 57) {

				System.out.print(sarr[i] + " ");

			} else {

				// System.out.print(sarr[i]+", ")
			}

		}

	}

}
