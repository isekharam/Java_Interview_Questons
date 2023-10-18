package com.practice;

public class FristLetter_Capital {

	public static void main(String[] args) {


		String name = "this is a chatgpt";
		String arr[] = name.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			char c = arr[i].charAt(0);
			String c1 = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			System.out.print(c1+sub+" ");
		}
	}
}
