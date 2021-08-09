package com.iu.s3.exception;

public class MyException extends Exception {
	//부모객체를 만들고 자식객체를 확장하는 형식 (상속)
	
	public MyException() {
		
		
	}
	
	public MyException(String message) {
		super(message);
	}

}
