package com.iu.s2.random;

import java.util.Random;

public class Password {
	public String makePassword() {
		
		//대문자,소문자,숫자 조합. 총 8글자.
		// 1. 대문자, 소문자 ,숫자 랜덤하게 결정 // switch 1 : 대문자 2 : 소문자 3 : 숫자 해서 랜덤하게 소환. random.nextInt(3)+1;
		// 2. 글자를 랜덤하게   // 아스키코드
		Random random = new Random();
		String pw="";
		
		for(int i =0; i<8; i++) {
			
		switch(random.nextInt(3)) {
		case 0 : int A = random.nextInt(90); // nextInt(26)+65;
		if(A>64 && A<91) {
			char A1 = (char)A;
			 pw = pw+A1;
		}else {
			--i;
			continue;
		}
		break;
		case 1: int a = random.nextInt(122); // nextInt(26)+97;
		if(a>97 && a<123) {
			char a1 = (char)a;
			pw = pw+a1;
		}else {
			--i;
			continue;
		}
		break;
		case 2 : int num = random.nextInt(10);
			pw = pw+num;
		break;
		}
		
		}
		
		
		return pw;
		
		
	}

}
