package test.main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.mypac.Member;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		// 추가할 회원의 정보
		String name = "이지현";
		String addr = "화성시";
		//추가할 회원의 정보를 Member객체에 담기
		Member mem=new Member();
		//객체의 필드가 public 공개 필드이기 때문에 대입연산자로 직접 참조해서 필드에 값을 대입할 수 있다.
		mem.name=name;
		mem.addr=addr;

		insert(mem);

	}

//회원 한 명의 정보를 추가하는 메소드 만들기
	public static void insert(Member m) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = new DBConnect().getConn();
		
		try {
			String sql = "INSERT INTO member" 
					+ " (num, name, addr)" 
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.name);
			pstmt.setString(2, m.addr);
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