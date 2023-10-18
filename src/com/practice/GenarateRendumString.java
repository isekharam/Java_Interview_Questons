package com.practice;

import java.util.Random;

public class GenarateRendumString {

	public static void main(String[] args) {
		
		
		String alfBitclOred = "ASDFVGBHTNHNN";
		
		StringBuilder sb = new StringBuilder();
		
		Random randum = new Random();
		
		int len = 7;
		
		for(int i=0; i<len; i++) {
			
			int index = randum.nextInt(alfBitclOred.length());
			 
			char randomChar = alfBitclOred.charAt(index);
			
			sb.append(randomChar);
		}
		
		String randumString = sb.toString();
		//System;
	}

}
