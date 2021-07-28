package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeatherInfo {
	
	private String info;
	private StringBuffer sb;
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80 , 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -43, 10, 눈,");
		sb.append("jeju, 3, 50, 비");
	}
	
	
	//searchWeather
	//도시명을 입력받아서 전체정보에서 일치하는 도시를 찾아서 DTO리턴
	public WeatherDTO searchWeather(WeatherDTO [] weatherDTOs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("지역 검색 정보 출력입니다.");
		System.out.println("검색할 도시를 입력해주세요");
		String s = sc.next();
		
		
		WeatherDTO save = null; //반환하기 위해 save 초기화
		
		for(int i =0; i<weatherDTOs.length;i++) {
			if(weatherDTOs[i].getCity().equals(s)) {   // getCity().equals()  <- 메소드 생각하자.
				save = weatherDTOs[i];
				
				
			}
			
		}
		
		return save;
		
	}
	
	
	
	
	
	
	public WeatherDTO [] makeWeather() {
		//split
		//trim
		info = sb.toString();  //StringBuffer를 String으로 만듦
		System.out.println(info);
		
		//파싱(parsing, 문자열을 자르는 작업)
		String [] strings = info.split(",");  //,기준으로 짜르자
		
		WeatherDTO [] weatherDTOs = new WeatherDTO[strings.length/4];
		
	
		
		
		for(int i=0; i<strings.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[i].trim());
			weatherDTO.setGion(strings[++i].trim());
			weatherDTO.setHum(strings[++i].trim());
			weatherDTO.setCondition(strings[++i].trim());
	
			weatherDTOs[i/4]=weatherDTO;
		}
		
		
		
		
		return weatherDTOs;
		
	}

}
