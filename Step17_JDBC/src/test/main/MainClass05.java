package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass05 {
	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * 4번 회원을 삭제해 보세요.
		 */
		int num=4;


		// DELETE작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성의 sql문
			String sql = "Delete member" 
						+ " WHERE num = ?";
			// PreparedStatement객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			// sql문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}