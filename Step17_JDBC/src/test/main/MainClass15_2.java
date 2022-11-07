package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass15_2 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 추가할 회원의 이름과 주소를 각각 입력받아서 MemberDto객체에 담고 MemberDto객체를 이용해서
		 * DB에 저장하는 프로그래밍을 해보세요..
		 */
		
		//만들어 놓은 dao사용

		Scanner scan = new Scanner(System.in);
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();
		
		System.out.print("추가할 회원의 이름을 입력해주세요.: ");
		dto.setName(scan.nextLine());
		System.out.print("추가할 회원의 주소를 입력해주세요.: ");
		dto.setAddr(scan.nextLine());
		
		dao.insert(dto);
		
	}
}
