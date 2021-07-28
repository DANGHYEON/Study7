package com.iu.s1.List.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {
	private String info;
	private Scanner sc;
	
	public MemberDAO() {
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
	}
	
	
	
	
	
	//memberLogin
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar){
		MemberDTO memberDTO = new MemberDTO();
		MemberDTO find = null;
		
		System.out.println("id를 입력해주세요");
		memberDTO.setId(sc.next());
		System.out.println("pw를 입력해주세요");
		memberDTO.setPw(sc.next());
		
		for(int i=0;i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				
				find =ar.get(i);
			}
			
		}
		
		return find;
	}
	
	
	
	
	//memberAdd
	//scanner로 id,pw,age를 입력받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO를 추가
	public void memberAdd(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("회원가입입니다.");
		System.out.println("id를 입력해주세요");
		memberDTO.setId(sc.next());
		System.out.println("pw를 입력해주세요");
		memberDTO.setPw(sc.next());
		System.out.println("나이를 입력해주세요");
		memberDTO.setAge(sc.nextInt());
		
		
		ar.add(memberDTO);
		System.out.println("회원가입 완료!");
	
	}
	
	
	//memberDelete
	//scanner로 id, pw를 입력받아서 dto에 추가
	// 매개변수로 ArrayList를 받아서 입력받은 id와 pw가 둘다 일치하는 애를 찾는다.
	// 찾아서 삭제하자.
	public void memberDelete(ArrayList<MemberDTO> ar) {
		
		MemberDTO memberDTO = new MemberDTO();
		
		// int result = 0; 삭제확인을 위한 변수
		System.out.println("id를 입력해주세요");
		memberDTO.setId(sc.next());
		System.out.println("pw를 입력해주세요");
		memberDTO.setPw(sc.next());
		
		for(int i=0;i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				ar.remove(i);
				// result = 1;   삭제확인을 위한 값
		
			}
			
		}
		// return result        삭제확인을 리턴
		
		
	}
	
	
	
	
	public ArrayList<MemberDTO> memberInit() {
		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
		
		StringTokenizer st = new StringTokenizer(info,",");
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken());
			memberDTO.setPw(st.nextToken());
			memberDTO.setAge(Integer.parseInt(st.nextToken()));
			ar.add(memberDTO);
		}
		
		return ar;
		
		
//		for(int i =0;i<ar.size();i++) {
//			System.out.println(ar.get(i).getId());
//			System.out.println(ar.get(i).getPw());
//			System.out.println(ar.get(i).getAge());
//		}
//		
		
	}
	

}
