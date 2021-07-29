package com.iu.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private Random random;
	private ArrayList<Integer> ar;
	
	
	public Lotto() {
		random = new Random();
		ar = new ArrayList<Integer>();
}
	
	
	
	public HashSet<Integer> makeLotto2() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		while(hashSet.size() != 6) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
		}
		
		return hashSet;
	}
	
	
	

	
	
	public int [] makeLotto(){
		int [] nums = new int [6];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(45)+1;
			
			for(int j=0; j<i;j++) {
				if(nums[j]==nums[i]) {
					i--;
				}
			}
			
		
		}
		
		return nums;
		
	}

}
