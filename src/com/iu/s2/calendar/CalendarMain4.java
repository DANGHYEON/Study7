package com.iu.s2.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca = Calendar.getInstance();
		
		//2021년 7월 29일
		int year = ca.get(Calendar.YEAR);
		int Mon = ca.get(Calendar.MONTH)+1;
		
		Date date = ca.getTime();
		String pa = "yyyy년 MM월 dd일 E요일";
		SimpleDateFormat sf = new SimpleDateFormat(pa);
		String result = sf.format(date);
		System.out.println(result);
		

	}

}
