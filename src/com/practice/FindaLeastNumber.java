package com.practice;

public class FindaLeastNumber {

	public static void main(String[] args) {
		// Below code is for to find a min and max number in a arrey

		int arr[] = { 2, 5, 7, 7, 9, 1, 2};

		int len = arr.length;
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < len; i++) {

			if (arr[i] < min) {

				min = arr[i];

			}
			 
			if(arr[i] > max) {
				
				max = arr[i];
			}
		}
		 
		System.out.println("This is the min number in the arrey"+" "+min);
		System.out.println("This is the max number in the arrey"+" "+max);
	}

}
