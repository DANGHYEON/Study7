package com.iu.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Date d1 = ca.getTime();
		System.out.println(d1);
//		ca.set(Calendar.YEAR, 2121);
//		d1=ca.getTime();
//		System.out.println(d1);

		ca.set(Calendar.DATE, 30);
		d1 =ca.getTime();
		System.out.println(d1);
		
		long l1 = ca.getTimeInMillis(); // 1000밀리 세컨즈 = 1초
		System.out.println(l1);
		
		//1980-11-15
		//ca.set(1980, 10,15);
		ca.set(1997, 1,21);
		d1 = ca.getTime();
		long l2 = ca.getTimeInMillis();
		System.out.println(d1);
		System.out.println(l2);
		
		long l3 = l1 - l2;
		System.out.println(l3);
		
		System.out.println("초 "+l3/1000);
		System.out.println("분 "+l3/(1000*60));
		System.out.println("시간 "+l3/(1000*60*60));
		System.out.println("몇일 "+l3/(1000*60*60*24));
		System.out.println("몇년 "+l3/(1000L*60*60*24*365));
		
		
		
	}

}
