package com.iu.s4.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// File file = new File("c:\\test\\study1.txt");
		
		// boolean result = file.exists();
		
		File file = new File("c:\\test");
		boolean result = file.exists();
		
		result = file.isDirectory();
		System.out.println(result);
		
		
		//   -----------------------------
		
		
		file = new File(file,"test.txt" );
		
		 result = file.exists();
		
		System.out.println(result);
		
			

	}

}
