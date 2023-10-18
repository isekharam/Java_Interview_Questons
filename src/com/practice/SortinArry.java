 
package com.practice;

public class SortinArry {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 5, 3, 9, 3, 6, -1, -3 };
		int len = arr.length;
		int temp;

		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}

}
