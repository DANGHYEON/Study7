package com.iu.s1.string;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "Hello World";
		String n2 = n.replace('l','z');
		
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf("W"));  //String n3 = n.substring(6);
		System.out.println(n3);
		
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("저장할 파일명을 입력");
		//입력 받은 파일명을 분석해서 이미지 파일 여부 판단 - jpg, gif, png, svg
		//a.text , iu.jpg, study.pdf, test.gif
		String file = sc.next();
		int find = file.indexOf("."); // file.lastIndexOf(".");
		
		String fileName = file.substring(find+1,file.length());
		System.out.println(fileName);
		
		if(fileName.equals("jpg") || fileName.equals("gif") || fileName.equals("png") ||fileName.equals("svg") ) {
			System.out.println("이미지 파일 입니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다.");
		}
		
		
		
		
		
	}

}	
