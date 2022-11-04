package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * JDBC (Java DataBase Connectivity)
 * 
 * DataBase에 연결해서 SELECT, INSERT, UPDATE, DELETE작업하기
 * 
 * Oracle에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을 사용할 수 있도록 설정해야 한다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		   //DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle.jdbc.driver::::: ojdbc.jar 안에 들어있는 클래스 파일
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름(=SID)
	         String url="jdbc:oracle:thin:@localhost:1521:xe"; //localhost:본인의 ip주소 (127.0.0.1)
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기 (conn은 그러므로 DB연결 객체이다.)
	         conn=DriverManager.getConnection(url, "scott", "tiger"); //scott(db id) / tiger(db pwd)에 접속하겠따!
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      //SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기.
	      PreparedStatement pstmt = null;
	      ResultSet rs=null;
	      
	      try {
	    	  //실행할 sql문
	    	  String sql="SELECT num, name, addr FROM member ORDER BY name DESC";
	    	  //PreparedStatement 객체의 참조값 얻어오기
	    	  pstmt=conn.prepareStatement(sql); //sql문을 수행해줘~~~
	    	  //PreparedStatement객체를 이용해서 query문 수행하고 결과를 ResultSet객체로 받아오기
	    	  rs=pstmt.executeQuery();
	    	  /*
	    	   * ResultSet객체의 .next()메소드는 cursor밑에 row가 존재하는지 확인해서
	    	   * 만약 존재하면 true를 리턴하고 cursor가 한 칸 밑으로 이동한다.
	    	   * 만일 존재하지 않으면 false를 리턴한다.
	    	   */
	    	  while(rs.next()) {//현재 cursor가 위치한 곳의 열1, 열2, 열3 얻어내기
	    		  System.out.println(
	    				  rs.getInt(1) //숫자를 얻어낼 때에는 getInt(열번호 or 열이름);
	    				  + "\t" + rs.getString(2)//문자를 얻어낼 때에는 getString(열번호 or 열이름);
	    				  +"\t"+rs.getString(3));
	    	  }
	    	  
	      } catch(Exception e) {
	    	  e.printStackTrace();
	      } finally {
	    	  try {
				if(rs!=null)rs.close();
		    	if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	      }
		
	}
}
