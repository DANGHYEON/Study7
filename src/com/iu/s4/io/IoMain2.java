package com.iu.s4.io;

import java.util.Calendar;
import java.util.UUID;

public class IoMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "";
		
		//fileName을 생성하는 코드
		
		
		
		//첫번째 방법
		Calendar calendar = Calendar.getInstance();
		long t = calendar.getTimeInMillis();
		
		fileName = String.valueOf("FileName : "+t);
		System.out.println(fileName);
		
		
		//두번째 방법
		fileName = UUID.randomUUID().toString();
		System.out.println(fileName);
		
		
		//몇번을 돌리든 중복 x 보장
		System.out.println(fileName);

	}

}
