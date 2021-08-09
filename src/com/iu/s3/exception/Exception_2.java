package com.iu.s3.exception;

import java.io.IOException;

public class Exception_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
		Test1 test1 = new Test1();
		
		try {
			test1.t1();
			
		}catch(Exception e){
			System.out.println("예외 처리 시작");
			// e.printStackTrace();   // 에러를 추적해서 프린트해라!
			// e.getMessage();
			
		}
		
		
		
		
//		int [] ar = {1,2,3,4,5,6};
//		Test2 test2 = new Test2();
//		test2.t2(ar);

	}

}
