package com.practice;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo {

	public static void main(String[] args) {


		Date d = new Date(0);
		
		System.out.println();
		
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println(sp.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -2 );
		
		sp.format(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(sp.format(cal.get(Calendar.DATE)));
	}

}
