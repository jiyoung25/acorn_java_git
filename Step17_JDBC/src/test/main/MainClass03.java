package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) {
		
	      Connection conn=null;
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver"); 
	         String url="jdbc:oracle:thin:@localhost:1521:xe"; 
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      //3번 회원의 주소를 동물원으로 수정하고자 한다.
	      int num=3;
	      String addr="동물원";
	      
	      
	      /*
	       * 1번 회원의 이름을 정우성 주소를 압구정동으로 수정해보세요.
	       */
	     
	      
	      //INSERT작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
	      PreparedStatement pstmt = null;
	      try {
	    	  //실행할 미완성의 sql문
	    	  String sql="UPDATE member"
	    	  		+" SET addr = ?"
	    	  		+" WHERE num = ?";
	    	  //PreparedStatement객체의 참조값 얻어오기
	    	  pstmt=conn.prepareStatement(sql);
	    	  pstmt.setString(1, addr); //첫번째 물음표에 addr을 넣어줘!~
	    	  pstmt.setInt(2, num); //두번째 물음표에 num을 넣어줘!~
	    	  //sql문 실행하기
	    	  pstmt.executeUpdate();
	    	  
	      } catch(Exception e) {
	    	  e.printStackTrace();
	      }
		
	}
}