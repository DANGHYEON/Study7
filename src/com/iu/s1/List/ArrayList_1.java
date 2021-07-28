package com.iu.s1.List;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList<>();
		
		ar.add("First");
		
		ar.add(5);
		
		ar.add("Int");
		
		ar.add("Double");
		
		ar.add(1,"add");
		
		ar.set(0, 1);
		ar.remove(0);
		ar.clear();
		System.out.println(ar.isEmpty());
		
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i));
//		}
		System.out.println("-------------------");
		
		ar.add("first");
		ar.add(2);
		ar.add(3.3333);
		ar.add('4');
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		String s0 = (String)ar.get(0);
		int s1 = (Integer)ar.get(1);
		
		
		
	}

}
