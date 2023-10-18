package com.practice;

public class FindVovelsinString {

	public static void main(String[] args) {
		
		String str = "#@#$%^&*()a78e12i4";
		
		for(int i=0; i<str.length(); i++){
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.println("Given string contains"+" "+str.charAt(i)+" "+" at the indes"+" "+i);
				
			}
		}

	}

}