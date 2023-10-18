package com.practice;

public class ReplaveCharector {

	public static void main(String[] args) {
		
		String name = "maheshbabu";
		char arr[] = name.toCharArray();
		System.out.println(name);
		for(int i=0;i<arr.length; i++) {
			if(arr[i]=='b') {
				arr[i]='@';
			}
		}
			for(char c : arr) {
				System.out.print(c);
			}
	}

}
