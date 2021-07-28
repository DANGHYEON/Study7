package com.iu.s1.string.ex1;

public class WeatherView   {
	
	
	public void view(WeatherDTO weather) {
		System.out.println("도시명\t기온\t습도\t상태\t");
		System.out.println("-------------------------");
		System.out.print(weather.getCity()+"\t");
		System.out.print(weather.getGion()+"\t");
		System.out.print(weather.getHum()+"\t");
		System.out.println(weather.getCondition());
		System.out.println("-------------------------");
		
		
	}
	
	
	
	
	
	
	
	public void view(WeatherDTO [] weather){
		
		System.out.println("날씨 정보 전체 출력입니다.");
		System.out.println("도시명\t기온\t습도\t상태\t");
		System.out.println("-------------------------");
		for(int i=0; i<weather.length; i++) {
			System.out.print(weather[i].getCity()+"\t");
			System.out.print(weather[i].getGion()+"\t");
			System.out.print(weather[i].getHum()+"\t");
			System.out.println(weather[i].getCondition());
			System.out.println("-------------------------");
		}
		
	}

	

}
