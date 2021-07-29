package com.iu.s1.List.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(2);
		
		MyList myList = new MyList();
		
		myList.remove(ar);
		
		for(int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
