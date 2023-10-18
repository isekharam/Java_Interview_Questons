package com.practice;

public class GivenNumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume = 1;
		
		boolean prime = true;
		
		for(int i=2; i<nume; i++ ) {
			
			if(nume%i==0) {
				prime=false;
			}
		}
		
		System.out.println(prime);
	}

}
