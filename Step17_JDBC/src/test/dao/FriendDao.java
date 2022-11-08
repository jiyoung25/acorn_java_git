package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import test.dto.FriendDto;
import test.dto.MemberDto;
import test.util.DBConnect;

public class FriendDao {
	Connection conn;
	FriendDto dto;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	int up_num;
	
	public boolean insert(FriendDto dto) {
		conn=new DBConnect().getConn();
		sql="INSERT INTO friend"
				+ " (num, name, phone, birth)"
				+ " VALUES(friend_seq.NEXTVAL, ?, ?, ?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setDate(3, new java.sql.Date(dto.getBirth().getTime()));
			up_num = pstmt.executeUpdate();
			System.out.println("insert작업 완료");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert작업 중 exception이 발생함");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return up_num == 0? false : true;
	}
	public boolean delete(int num) {
		conn=new DBConnect().getConn();
		sql="DELETE FROM friend"
				+ " WHERE num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			up_num = pstmt.executeUpdate();
			System.out.println("delete작업 완료");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("delete작업 중 exception이 발생함");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return up_num == 0? false : true;
	}
	public boolean update(FriendDto dto) {
		conn=new DBConnect().getConn();
		sql="UPDATE friend"
				+ " SET name=?, phone=?, birth=?"
				+ " WHERE num = ?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setDate(3, new java.sql.Date(dto.getBirth().getTime()));
			pstmt.setInt(4, dto.getNum());
			up_num = pstmt.executeUpdate();
			System.out.println("update작업 완료");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("update작업 중 exception이 발생함");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return up_num == 0? false : true;
	}
	
	public List<FriendDto> friendList (){
		List<FriendDto> f_list=new ArrayList<>();
		FriendDto dto=null;

		sql="SELECT num, name, phone, birth"
				+ " FROM friend"
				+ " ORDER BY num ASC";
		try {		
			conn=new DBConnect().getConn();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto=new FriendDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setBirth(new SimpleDateFormat("YYYYMMDD").format(rs.getDate("birth")));
				
				f_list.add(dto);
			}
			System.out.println("전체 친구 목록입니다.");
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

		return f_list;
	}

	public FriendDto getData(int num) {
		conn=new DBConnect().getConn();
		sql="SELECT num, name, phone, birth"
				+ " FROM friend"
				+ " WHERE num = ?";
		
		try {
			dto=new FriendDto();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				dto.setNum(rs.getInt(1));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setBirth(new SimpleDateFormat("YYYYMMDD").format(rs.getDate("birth")));
			}
			
			System.out.println("선택한 번호의 친구정보입니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}
}
