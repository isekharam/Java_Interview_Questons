
package com.practice;

import javax.print.DocFlavor.STRING;

public class StringRev {

	public static void main(String[] args) {


		String name = "Breco";
		int len = name.length();
		String temp = "";
		
		
		for (int i=len-1 ; i>=0; i--) {
			
			temp = temp+name.charAt(i);
		}
			
		System.out.println(temp);
		
		if(temp.equals(name)) {
			System.out.println("Thsis ");
		}
	}

}
