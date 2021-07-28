package com.iu.s1.wrapper;

public class WrapperMain3 {

	public static void main(String[] args) {
		String jumin = "991224-1234567";
		//주민등록 마지막번호는 검증번호로 계산하지 않음.
		//첫째부터 곱하기 2 , 3, 4 ...
		// 그후 다 더함.
		// 그후 11로 나누어 나머지 구하기
		// 11에서 나머지를 빼기 -> 만약 두자리 이상이면 다시 10으로 나누어서 그 나머지를 구하기.
		// 나머지 숫자랑 체크 번호랑 같으면 올바른 번호
		char ch =jumin.charAt(0);
		String n1 = String.valueOf(ch);
		int num = Integer.parseInt(n1);
		
		//substirng
		String n2 = jumin.substring(0,1);
		int num2 = Integer.parseInt(n2);
		System.out.println(num2*2);
		
		
		
		

	}

}
