package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass02 {
	public static void main(String[] args) {

		//Member table에 추가할 회원의 정보라고 가정하자.
		int num=4;
		String name="주뎅이";
		String addr="수원시";
		
	      Connection conn=null;
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver"); 
	         String url="jdbc:oracle:thin:@localhost:1521:xe"; 
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      // conn.setAutoCommit(false); : auto commit을 끈다 (default 값: true)
	      
	      //INSERT작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
	      PreparedStatement pstmt = null;
	      try {
	    	  //실행할 미완성의 sql문
	    	  String sql="INSERT INTO MEMBER"
	    			  +" (num, name, addr)"
	    			  +" Values(?,?,?)";
	    	  //PreparedStatement객체의 참조값 얻어오기
	    	  pstmt=conn.prepareStatement(sql);
	    	  pstmt.setInt(1, num);
	    	  pstmt.setString(2, name);
	    	  pstmt.setString(3, addr);
	    	  //sql문 실행하기
	    	  pstmt.executeUpdate();
	    	  
	      } catch(Exception e) {
	    	  e.printStackTrace();
	      }
		
	}
}
