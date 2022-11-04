package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="호빵";
		String addr="분식집";
		
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		dto.setNum(num);
		
		update(dto);
		
	}
	
	//회원 한명의 정보를 수정하는 메소드
	public static void update(MemberDto dto) {
		Connection con= null;
		PreparedStatement pstmt = null;
		con=new DBConnect().getConn();
		
		try {
			String sql="UPDATE member"
					+" SET name = ?,addr = ?"
					+" WHERE num = ?";
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			pstmt.executeUpdate();
			
			System.out.println("회원 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
