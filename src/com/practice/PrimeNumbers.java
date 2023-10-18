package com.practice;

public class PrimeNumbers {

	public static void main(String[] args) {
		//1 to 10 
		
		for(int i=2; i<=100; i++ ) {
			int flag=0;
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i +" is a prime number ");
			}
		}
	
	}

}
