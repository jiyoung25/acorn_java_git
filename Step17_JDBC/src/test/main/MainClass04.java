package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass04 {
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
		 * 1번 회원의 이름을 정우성 주소를 압구정동으로 수정해보세요.
		 */
		int num = 1;
		String name = "정우성";
		String addr = "압구정동";

		// UPDATE작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성의 sql문
			String sql = "UPDATE member" 
						+ " SET addr = ?, name = ?" 
						+ " WHERE num = ?";
			// PreparedStatement객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr); 
			pstmt.setString(2, name);
			pstmt.setInt(3, num);
			// sql문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}