package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		// 추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		
		//추가할 회원의 정보를 MemberDto객체에 담기
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//insert() 메소드를 호출하면서 MemberDto객체를 전달
		insert(dto);
	}

	//회원 한 명의 정보를 추가하는 메소드 만들기
	public static void insert(MemberDto dto) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = new DBConnect().getConn();
		
		try {
			String sql = "INSERT INTO member" 
					+ " (num, name, addr)" 
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
	        pstmt.executeUpdate();
	        System.out.println("회원 정보를 추가했습니다.");
			
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