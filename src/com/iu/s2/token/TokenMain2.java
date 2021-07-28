package com.iu.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		String str = "korea-USA-china*france*UK-canada-germany" ;
				
		str = str.replace("*", "-"); // 부호 통일시키기
	
		StringTokenizer st = new StringTokenizer(str,"-");
		
		
		while(st.hasMoreTokens()) {
			String n = st.nextToken();
			System.out.println(n.toUpperCase());
		}
		
		

		
		
		
		

	}

}
