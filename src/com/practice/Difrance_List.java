package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Difrance_List {

	public static void main(String[] args) {


		List<String> s = new ArrayList();
		
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("e");
		s.add("f");
		s.add("g");
		
		List<Integer> n = new ArrayList();
		
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		
		
		for(int i=0; i<n.size(); i++) {
			
			
			System.out.println(s.get(i)+n.get(i));
		}
	}

}
