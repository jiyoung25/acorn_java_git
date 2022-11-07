package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		//삭제할 회원의 번호라고 하자
		int num=4;
		delete(num);
		
		
		
	}
	//인자로 전달한 번호에 해당하는 회원 한 명의 정보를 삭제하는 메소드
	public static void delete(int num) {
		Connection conn=null;
		PreparedStatement pstm=null;
		String sql="DELETE"
				+ " FROM member"
				+ " WHERE num= ? ";
		try {
			conn=new DBConnect().getConn();
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, num);
			pstm.executeUpdate();
			System.out.println("회원 정보를 삭제했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null)pstm.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
