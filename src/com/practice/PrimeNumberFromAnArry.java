package com.practice;

public class PrimeNumberFromAnArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 8, 1, 3, 9, 9,4, 7 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j=1; j<=arr[i]; j++) {
				
				if(arr[i]%j==0) { 
					count++;
				}
			}
			
			if(count==2) {
				System.out.println(arr[i]+" "+"prime number");
			}else {
				System.out.println(arr[i]+" "+ "not a prime number");
			}
		}
	}

}
 