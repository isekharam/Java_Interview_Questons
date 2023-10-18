package com.practice;

import java.text.SimpleDateFormat;
import java.util.*;



public class CalenderLear {

	public static void main(String[] args) {
		
		
		SimpleDateFormat smp = new SimpleDateFormat("dd,MM,YYYY");
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DAY_OF_MONTH, -8);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(smp.format(cal.getTime()));

	}

}
