package com.iu.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {
	
	
	
	public void Write2() {
		//id, pw , age 입력
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\test","membet.txt");
		
		System.out.println("id를 입력해주세요");
		
		//c -> test -> member.txt
		// id=pw-age 저장
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(message+"\r\n");     // 이렇게 해야함.
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void write() {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\test","test.txt");
		
		System.out.println("메세지를 입력하세요");
		String message=sc.next();  // 띄어쓰기 나오는 순간 끝 띄어쓰기 까지 가져오려면 nextline() 쓰기
		
		try {
			
			FileWriter fw = new FileWriter(file,true);
			fw.write(message+"\r\n");     // 이렇게 해야함.
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
