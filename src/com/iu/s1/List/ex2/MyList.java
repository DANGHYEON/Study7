package com.iu.s1.List.ex2;

import java.util.ArrayList;

public class MyList implements DataIO {

	@Override
	public void add(ArrayList<Integer> ar, int num) {
		ar.add(0,num);
		
	}

	@Override
	public void remove(ArrayList<Integer> ar) {
		
		ar.remove(ar.size()-1);
	}
	
	
	
	
	//add num을 list에 맨 앞에 추가
	//remove  list에서 무조건 마지막 요소를 삭제 
	
	
	
	
	
	

}
