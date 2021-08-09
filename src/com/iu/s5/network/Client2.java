package com.iu.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		Socket sc=null;
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		
		// 1. server 접속
		try {
			//서버 접속 전
			sc = new Socket("121.170.94.208", 8282);
			System.out.println("서버와 접속이 성공");
			
			boolean check = true;
			
			while(check) {
			
				//서버로 메세지 전송
				
				
				System.out.println("1. 점심 메뉴");
				System.out.println("2. 저녁 메뉴");
				System.out.println("3. 종    료");
				int message=scanner.nextInt();
				
				//byte 처리
				os = sc.getOutputStream();
				//문자 처리
				ow = new OutputStreamWriter(os);
				//문자열 처리
				bw = new BufferedWriter(ow);
				
				bw.write(message+"\r\n");
				bw.flush();
				
				
				if(message>2) { 
					break;
				}
				
				
				
				//서버에서 보낸 메세지를 받아서 출력
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				String str = br.readLine();
				System.out.println("서버에서 보낸 메세지");
				System.out.println("메뉴 : "+str);
				
				
				
			}//while의 끝
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				scanner.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		// 2. 1번누르면 점심메뉴
		//    2번누르면 저녁메뉴
		//    3번누르면 종료

	}

}
