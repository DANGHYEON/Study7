package com.iu.s1.List;

import java.util.ArrayList;
import java.util.List;



public class ArrayList_2 {

	public static void main(String[] args) {
		//type이 안전하지 않다.
		ArrayList<String> ar = new ArrayList<String>();
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		//List는 ArrayList의 super class(Interface)
		//단, generic type도 일치
		List<Integer> list = ar1;
		
		
		
		
		// List<Object> list1 = ar; 안됨
		
		

	}

}
