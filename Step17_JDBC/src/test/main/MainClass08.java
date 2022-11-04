package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		// 추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		//추가할 회원의 정보를 HashMap객체에 담기
		Map<String, Object> map=new HashMap<>();
		map.put("name", name);
		map.put("addr", addr);

		insert(map);
	}

	//회원 한 명의 정보를 추가하는 메소드 만들기
	public static void insert(Map<String, Object> m) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = new DBConnect().getConn();
		
		try {
			String sql = "INSERT INTO member" 
					+ " (num, name, addr)" 
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String)m.get("name"));
			pstmt.setString(2, (String)m.get("addr"));
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