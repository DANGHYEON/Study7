package com.iu.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		try {
			
		int num = sc.nextInt();
		
		int num2 = 20;
		
		int num3 = num2 / num;
		
		
		System.out.println(num3);
		}catch(ArithmeticException e) {
			System.out.println("예외처리 완료");
		}catch (InputMismatchException e) {
			System.out.println("숫자만입력");
		}
		
		System.out.println("finish");

	}

}
