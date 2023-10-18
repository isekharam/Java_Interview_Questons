package com.practice;

public class FindUniqNumber {

	public static void main(String[] args) {
		
		int arr[] = {4,5,5,5,4,6,6,6,9,4,7};
		
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			
			int count=0;
			
			for(int j=0; j<len; j++) {
				
				
				if(arr[j]==arr[i]) {
					
					count++;
				}
			}
			
			if(count==1) {
				System.out.println("Uniqie number"+" "+arr[i]);
			}
		}
	}

}


