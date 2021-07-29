package com.iu.s1.List.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	private Scanner sc;
	private MemberDTO DTO;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;
	private MemberView view;
	
	public MemberController() {
		sc = new Scanner(System.in);
		DTO = new MemberDTO();
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit(); //초기화
		view = new MemberView();
		}
	

	public void start() {
		//1. 회원 가입
		//2. 로그인
		boolean check = true;
		
		while(check) {
			
			
			if(MemberSession.SESSION.get("member") != null) {
				
				afterLogin();
				
			}else {
			check = beforeLogin();
			}
			
			
		}
		
		
		}//start 
	
	
	private void afterLogin() {
		System.out.println("1. Mypage");
		System.out.println("2. Logout");
		int select = sc.nextInt();
		
		switch(select) {
		case 1 : System.out.println("자기 정보 출력");
				 view.view();
				 break;
		case 2 : System.out.println("로그 아웃");
				 MemberSession.SESSION.remove("member");
				 // or MemberSession.SESSION.put("menber",null); (수정하기)
				 
				 break;
		default : System.out.println("힝");
			
		}
		
		
		
		
		
	}
	
	
	
	
	
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
		DTO = memberDAO.memberLogin(ar);
		
		if(DTO!=null) {
			System.out.println("로그인 성공");
			MemberSession.SESSION.put("member", DTO);
			
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
