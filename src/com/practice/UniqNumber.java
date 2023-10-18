package com.practice;

public class UniqNumber {

	public static void main(String[] args) {

		int arr[] = { 9, 9, 9, 6, 6, 6, 3, 3, 3, 4, 4, 4, 4, 2, 8, 0 };

		int len = arr.length;

		for (int i = 0; i < len; i++) {
			int count = 0;
			for (int j = 0; j < len; j++) {

				if (arr[j] == arr[i]) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
