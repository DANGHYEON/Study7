package com.iu.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		String name = "Hello World";
		
		char ch = 'o';
		int count=0;
		for(int i=0; i<name.length();i++ ) {
			
			if(name.charAt(i)==ch) {
				count ++;
			}
			
		}
		System.out.println(count);
		
//		int b = name.indexOf('o');
//		int a =name.indexOf('e');
//		System.out.println(a);
		
		
	
	}

}
