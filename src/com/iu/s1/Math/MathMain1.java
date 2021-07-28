package com.iu.s1.Math;

public class MathMain1 {

	public static void main(String[] args) {
		//0~9 이하(10미만)의 랜덤한 정수를 출력
		
		double d =Math.random();
		int i = (int)(d*10);
		System.out.println(d);
		System.out.println(i);
	}

}
