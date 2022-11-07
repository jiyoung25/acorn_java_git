package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass15_1 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 추가할 회원의 이름과 주소를 각각 입력받아서 MemberDto객체에 담고 MemberDto객체를 이용해서
		 * DB에 저장하는 프로그래밍을 해보세요..
		 */
		
		//기껏 만들어놓은 MemberDao 사용 안했음 ㅋㅋ

		Scanner scan = new Scanner(System.in);
		MemberDto dto= new MemberDto();
		
		System.out.print("추가할 회원의 이름을 입력해주세요.: ");
		dto.setName(scan.nextLine());
		System.out.print("추가할 회원의 주소를 입력해주세요.: ");
		dto.setAddr(scan.nextLine());
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="INSERT INTO member"
				+ " (num, name, addr)"
				+ " VALUES(member_seq.NEXTVAL, ?, ?)";
		
		try {
			conn=new DBConnect().getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			System.out.println("회원 목록을 추가했습니다.");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
