package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.mypac.DBConnect;
import test.mypac.MemberDto;

public class review_Member {
	public static void main(String[] args) {
		MemberDto dto= new MemberDto();
		delete(dto);
	}
	
	public static void delete(MemberDto dto) {
		Scanner scan=new Scanner(System.in);
		PreparedStatement pstm = null;
		Connection con = null;
		con=new DBConnect().getConn();
		
		String sql="DELETE"
				+ " FROM member"
				+ " WHERE num =?";
		try {
		System.out.print("삭제할 행의 번호를 입력해주세요.: ");
		dto.setNum(scan.nextInt());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("제대로 된 번호로 입력해주세요.");
			return;
		}
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, dto.getNum());
			pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null)pstm.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
