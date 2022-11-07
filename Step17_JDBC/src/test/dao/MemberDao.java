package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Data Access Object만들어보기
 * 
 * - DB에 insert, update, delete, select 작업을 대신해주는 객체를 생성할 클래스 설계하기
 */

public class MemberDao {
	
	//회원 한 명의 정보를 저장하고 작업의 성공 여부를 리턴해주는 메소드
	public boolean insert(MemberDto dto) {
		Connection con= null;
		PreparedStatement pstmt = null;
		con=new DBConnect().getConn();
		int rowCount=0;
		
		try {
			String sql="INSERT INTO member "
					+ "(num, name, addr) "
					+ "VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//sql문을 실행하고 변화된 (추가, 수정, 삭제 )row의 갯수 리턴받기
			rowCount = pstmt.executeUpdate();
			
			System.out.println("회원 정보를 추가했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//rowCount값을 확인해서 작업의 성공여부 리턴
		return rowCount==0? false:true;
	}
	
	//회원 한 명의 정보를 수정하고 작업의 성공 여부를 리턴해주는 메소드
	public boolean update(MemberDto dto) {
		Connection con= null;
		PreparedStatement pstmt = null;
		con=new DBConnect().getConn();
		int rowCount=0;
		
		try {
			String sql="UPDATE member"
					+ " SET name = ?, addr = ?"
					+ " WHERE num = ?";
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			//sql문을 실행하고 변화된 (추가, 수정, 삭제 )row의 갯수 리턴받기
			rowCount = pstmt.executeUpdate();
			
			System.out.println("회원 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount==0? false:true;
	}
	
	//회원 한 명의 정보를 삭제하고 작업의 성공 여부를 리턴해주는 메소드
	public boolean delete(int num) {
		Connection con= null;
		PreparedStatement pstmt = null;
		con=new DBConnect().getConn();
		int rowCount=0;
		
		try {
			String sql="DELETE"
					+ " FROM member"
					+ " WHERE num= ?";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1,num);
			//sql문을 실행하고 변화된 (추가, 수정, 삭제 )row의 갯수 리턴받기
			rowCount = pstmt.executeUpdate();
			
			System.out.println("회원 정보를 삭제했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowCount > 0? true:false;
	}
	
	public List<MemberDto> getList() {
		List<MemberDto> mem_d = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT num, name, addr" + " FROM member" + " ORDER BY num ASC";

		try {
			conn = new DBConnect().getConn();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				MemberDto dto= new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//회원 한 명의 정보가 담긴 MemberDto객체의 참조값을 ArrayList 객체에 누적시키기
				mem_d.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if (rs != null)rs.close();
					if (pstm != null)pstm.close();
					if (conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		//모든 회원의 정보가 누적된 ArrayList 객체의 참조값 리턴해주기
		return mem_d;
	}
	
	public MemberDto getData(int num) {
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
