package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.mypac.DBConnect;
import test.mypac.MemberDto;

public class review_Member2 {
	
	static Scanner scan=null;
	static Connection conn=null;
	static PreparedStatement pstmt=null;
	static String sql;
	static int rowCount;
	static MemberDto dto=null;
	static ResultSet rs=null;
	
	
	public static void main(String[] args) {
		for(int i=0; i<getList().size(); i++) {
			System.out.println(getList().get(i).getNum() + "|" + getList().get(i).getName() + "|" + getList().get(i).getAddr() + "|");
		}
	}
	
	public static boolean insert(MemberDto dto) {
		scan=new Scanner(System.in);
		conn=new DBConnect().getConn();
		sql="INSERT INTO member"
				+ " (num, name, addr)"
				+ " VALUES(member_seq.NEXTVAL, ?, ?)";
		
		try {
			System.out.print("추가할 회원의 이름을 입력해주세요.: ");
			dto.setName(scan.nextLine());
			System.out.print("추가할 회원의 주소를 입력해주세요.: ");
			dto.setAddr(scan.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("양식대로 입력해주세요.");
		}

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			rowCount=pstmt.executeUpdate();
			
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
		
		return rowCount == 0? false:true;
	}
	
	public static boolean update(MemberDto dto) {
		
		scan=new Scanner(System.in);
		rowCount = 0;
		
		sql="UPDATE member"
			+ " SET name = ?, addr = ?"
			+ " WHERE num = ?";
		try {
		System.out.print("수정할 열의 번호(num)를 입력해주세요.: ");
		dto.setNum(scan.nextInt());
		System.out.print("이름의 수정 내용을 입력해주세요.: ");
		dto.setName(scan.nextLine());
		System.out.print("주소의 수정 내용을 입력해주세요.: ");
		dto.setAddr(scan.nextLine());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("양식을 순서대로 입력해주세요.");
		}

		try {
			conn=new DBConnect().getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			rowCount =pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			rowCount=0;
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowCount == 0? false:true;
	}
	
	public static boolean delete(MemberDto dto) {

		scan=new Scanner(System.in);
		System.out.print("삭제할 행의 번호를 입력해주세요.: ");
		dto.setNum(scan.nextInt());
		try {
		conn=new DBConnect().getConn();
		sql="DELETE FROM member WHERE num = ?";
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("양식에 맞추어 다시 작성해주세요.");
		}
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			rowCount=pstmt.executeUpdate();
			
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
		return rowCount==0? false:true;
	}
	public static List<MemberDto> getList(){
		List<MemberDto> mem_d = new ArrayList<>();
		sql="SELECT num, name, addr"
			+ " FROM member"
			+ " ORDER BY num ASC";
		
		try {
			conn=new DBConnect().getConn();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto=new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("name"));
				mem_d.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mem_d;
	}
}
