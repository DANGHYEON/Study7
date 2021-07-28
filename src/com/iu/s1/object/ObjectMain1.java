package com.iu.s1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		//객체 생성
		//클래스명 참조변수명 = new 생성자();
		//object 객체 생성
		Object obj = new Object();
		
		//멤버변수, 멤버메서드 호출
		//참조변수명.변수명
		//참조변수명.메서드명([인자값]);
		int num = obj.hashCode();
		String s =obj.toString();
		boolean a =obj.equals(obj);
		System.out.println(num);
		System.out.println(s);
		System.out.println(a);
		
		Test test = new Test();
		Test test2 = new Test();
		System.out.println(test == test2);
		System.out.println(test.num1==test2.num1);
		test2.num2=2;
		System.out.println(test.equals(test2));
		

	}

}
