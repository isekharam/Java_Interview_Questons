package com.practice;

public class Panaroma {

	public static void main(String[] args) {
		
		String name = "MoM";
				
				int i=0; 
				int j=name.length()-1;
				
				while(i<j) {
					
					if(name.charAt(i) != name.charAt(j)) {
						
						System.out.println("This is not a pelendrome");
						System.exit(0);;
					}
					
					i++;
					j--;
				}
			
				System.out.println("This is a pelendrome");
	}

}
