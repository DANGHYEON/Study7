package com.iu.s1.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		//Member 타입을 모을려고 하는 리스트 선언
		ArrayList<Member> ar = new ArrayList<Member>();
		Member member = new Member();
		member.setId("iu");
		member.setPw("pw");
		ar.add(member);
		
		ar.add(new Member());
		ar.get(1).setId("test");
		ar.get(1).setPw("ppw");
		
		System.out.println(ar.get(0).getId());
		System.out.println(ar.get(1).getId());
		
		Member member2 = ar.get(0);
		
		
		
		
		
		
		

	}

}
