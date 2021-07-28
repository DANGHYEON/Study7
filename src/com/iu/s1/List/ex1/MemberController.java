package com.iu.s1.List.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	private Scanner sc;
	private MemberDTO DTO;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;
	
	public MemberController() {
		sc = new Scanner(System.in);
		DTO = new MemberDTO();
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit(); //초기화
	}
	

	public void start() {
		//1. 회원 가입
		//2. 로그인
		boolean check = true;
		
		while(check) {
			check = beforeLogin();
		}
		
		
		
		}//start 
	
	private boolean beforeLogin() {
		
	
		
		
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종 료");
		
		boolean flag = true;
		switch(sc.nextInt()) {
		
		case 1 : 
		memberDAO.memberAdd(ar);
		break;
		case 2 :
		MemberDTO DTO1 = memberDAO.memberLogin(ar);
		
		if(DTO1!=null) {
			System.out.println("로그인 성공");
			
		}else{
			System.out.println("로그인 실패");
		}
		break;
		default : System.out.println("종료합니다.");
		flag = false;
		
		
	}
		return flag;
		
	}
	
	
}
