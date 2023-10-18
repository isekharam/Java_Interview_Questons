package com.practice;

import java.util.HashSet;

public class RemoveDuplicateElementsArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,9,2,3,4,5,4,3,3,4,5,3,4,5};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr.length;i++) {
			
			hs.add(arr[i]);
		}
		for(int no : hs) {
			System.out.println(no);
		}
	}

}
