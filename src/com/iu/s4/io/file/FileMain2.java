package com.iu.s4.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test");
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더명 입력");
		String name = sc.next();    // 
		
		file = new File(file,name);  // c:\\test\\t3\\sub
		
		
		
		
		if(file.exists()) {
			file.delete();  //파일 삭제 하지만 그 안에 아무런 파일도 없어야함.
			
		}else {
			file.mkdirs();
		}
		
		
		
		
//		if(!file.exists()) {
//			file.mkdir();  //폴더 생성   있는폴더명//만들폴더명 하면 폴더안에 폴더 만듦
//		}
//		
		
		
		
		
		
//		if(file.exists()) {
//			System.out.println("해당 폴더 있음");
//			
//		}else {
//			System.out.println("폴더 없음");
//		}
//		
	}

}
