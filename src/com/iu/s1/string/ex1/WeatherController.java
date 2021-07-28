package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo(); //객체 생성
		weatherView = new WeatherView();
	}

	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		
			// WeatherDTO [] weather = new WeatherDTO[10];
			boolean check = true;
			
			WeatherDTO [] weather = weatherInfo.makeWeather();
		
			while(check) {
			System.out.println("1. 날씨 정보 전체 출력");
			System.out.println("2. 지역 검색 정보 출력");
			System.out.println("3. 지역 정보 추가");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				weatherView.view(weather);
				
			break;
			
			case 2 :
				WeatherDTO weather1	= weatherInfo.searchWeather(weather);
				if(weather1!=null) {
				weatherView.view(weather1);
				}else {
					System.out.println("해당 도시의 정보가 없습니다.");
				}
					
			break;
			
			case 3 : System.out.println("지역 정보 추가입니다.");
			break;
			
			default : System.out.println("프로그램을 종료합니다.");
			check = false;
			}
			
			
			
			
			
			
		}
		
		
		System.out.println("Finish");
		
	}
}
