package com.iu.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {
	
public static void main(String[] args) {
	File file = new File("c:\\test","name.txt");
	
	try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<FileMember> ar = new ArrayList<FileMember>();
		
	while(true) {	
		String str = br.readLine();
		
		if(str==null) {
			break;
		}
		FileMember fileMember = new FileMember();
		//파싱 작업
		StringTokenizer st = new StringTokenizer(str,",");
		
	//이번껀 while문 없어도 됨
		fileMember.setId(st.nextToken());
		fileMember.setPw(st.nextToken());
		fileMember.setAge(Integer.parseInt(st.nextToken()));
	
		ar.add(fileMember);
		System.out.println(str);
	}
	
	for(int i=0;i<ar.size();i++) {
		System.out.println("id : "+ ar.get(i).getId());
		System.out.println("pw : "+ar.get(i).getPw());
		System.out.println("age : "+ar.get(i).getAge());
		System.out.println("------------------------------");
	}
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

private static void While(boolean hasMoreTokens) {
	// TODO Auto-generated method stub
	
}
	

}
