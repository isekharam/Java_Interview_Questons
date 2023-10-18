package com.practice;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Batman";
		int len = name.length();
		String temp ="";
		
		for (int i=len-1; i>=0; i--) {
			
			temp=temp+name.charAt(i);
		}
		
		System.out.println(temp);
	}
}
