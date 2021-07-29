package com.iu.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain_1 {

	public static void main(String[] args) {
		//현재 날짜와 시간의 정보
		Calendar ca = Calendar.getInstance(); // new GregorianCalendar
		System.out.println(ca);
		
	int year =	ca.get(Calendar.YEAR);
	System.out.println(year);
	int month = ca.get(Calendar.MONTH);
	System.out.println(month);  //6월로 나옴 why? -> 컴퓨터는 0부터 시작함 그래서 7월인데 6월이 나옴
	int date = ca.get(Calendar.DATE);
	System.out.println(date);
	
	
	//시 분 초
	int si = ca.get(Calendar.HOUR);
	System.out.println(si);
	int bun = ca.get(Calendar.MINUTE);
	System.out.println(bun);
	int cho = ca.get(Calendar.SECOND);
	System.out.println(cho);
	
	
	Date d = ca.getTime();
	System.out.println(d);
	
	}

}
