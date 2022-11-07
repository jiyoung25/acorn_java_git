package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//MemberDa객체를 생성해서 참조값을 dao라는 지역변수에 담기
		MemberDao dao = new MemberDao();
		
		//추가할 회원의 정보
		String name="원숭이";
		String addr="동물원";
		
		MemberDto dto= new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		boolean isSuccess=dao.insert(dto);
		System.out.println(isSuccess? name+"의 정보를 추가했습니다.":"회원 정보 추가 실패!");
		
	}
}
