package com.iu.s1.string;

public class StringMain6 {
	public static void main(String[] args) {
		
		String weather = "서울-대구-대전-광주-부산-제주";
		
		String [] citys = weather.split("-");
		
		for(int i =0; i<citys.length;i++) {
			System.out.println(citys[i]);
			
		}
		
		String name = "서울 대구 대전 광주 부산 제주";
		
		
		String n = name.replace(" ", ""); // 띄어쓰기 모두 제거
		System.out.println(n);
		
	}

}
