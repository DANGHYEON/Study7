package com.iu.s1.wrapper;

public class WrapperMain2 {

	public static void main(String[] args) {
		//주민번호를 입력받음
		//991224-1234567
		//이 사람은 몇살이다.
		//3-5 : 봄 / 6-8 : 여름 / 9-11 : 가을 / 12 - 2 : 겨울
		String num = "990724-1234567";
		
		String year = num.substring(0,2);
		int y = Integer.parseInt(year);
		y = 1900+y;
		int age = 2021-y;
	
		String m = num.substring(2,4);
		int mon = Integer.parseInt(m);
		if(mon>=3 && mon<6) {
			System.out.println("봄");
		}else if(mon>=6 && mon<9) {
			System.out.println("여름");
		}else if(mon>=9 && mon<12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
	}

}
