package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;
//회원 한 명의 정보를 리턴하기

public class MainClass13 {
	public static void main(String[] args) {
		//메소드를 호출해서 인자로 전달한 번호에 해당하는 회원의 정보를 얻어오기
		MemberDto dto=getData(5);
		if(dto==null) {
			System.out.println("해당 회원은 존재하지 않습니다.");
		} else {
			System.out.println("번호: "+dto.getNum()+", 이름: "+dto.getName()+", 주소: "+dto.getAddr());
		}
	
	}
	
	//인자로 전달된 번호에 해당하는 회원 한 명의 정보를 리턴하는 메소드
	public static MemberDto getData(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//MemberDto객체의 참조값을 담을 지역변수 미리 만들기
		MemberDto dto=null;
		
		String sql="SELECT num, name, addr"
				+ " FROM member"
				+ " WHERE num= ? ";
		

		try {
			dto=new MemberDto();
			conn=new DBConnect().getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("Addr"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return dto;
	}
}
