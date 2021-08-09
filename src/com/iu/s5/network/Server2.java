package com.iu.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<String>();
		lunch.add("김치찌개");
		lunch.add("오므라이스");
		lunch.add("샌드위치");
		lunch.add("치즈라면");
		lunch.add("제육볶음");
		lunch.add("비빔밥");
		
		String [] dinner = {"내장탕","삼계탕","삼겹살","선지국","소고기","곱창"};
		
		// client 접속 준비
		Socket sc=null;
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		ServerSocket ss=null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		Random random = null;
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 기다리는 중");
			// client와 접속이 성공하면
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			String message = "서버와 연결 성공!";
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(message+"\r\n");
			bw.flush();
			
			boolean check = true;
			
			while(check) {
				
				Calendar calendar = Calendar.getInstance();
				random = new Random(calendar.getTimeInMillis());
			
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				 int message1 = br.read();
				System.out.println("클라이언트에서 보낸 메세지");
				System.out.println("Client : "+message1);
				String menu =null;
				if(message1==3) {  //강제로 대문자로 만들어 Q도 포함
					// check = false; -> 이러면 밑에 코드들도 모두 실행 됨. 이러면 continue까지 적어야 함.
					break;
				}else if(message1==1) {
					int num = random.nextInt(lunch.size());
					menu=lunch.get(num);
					
				}else if(message1==2) {
					int num = random.nextInt(dinner.length);
					menu= dinner[num];
					
				}
				
				System.out.println("클라이언트로 보낼 메세지 입력");
						
				//message 클라이언트로 전송
				bw.write(menu+"\r\n");
				bw.flush();
			}//while의 끝
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		// 1이면 점심 메뉴 중에서 하나를 전송
		// 2이면 저녁 메뉴 중에서 하나를 전송
		// 3이면 프로그램 종료

	}

}
