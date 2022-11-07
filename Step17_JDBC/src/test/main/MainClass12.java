package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		
		 List<MemberDto> list=getList();
	      for(MemberDto tmp:list) {
	         System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr());
	      }

	}

	// 전체 회원의 목록을 리턴해주는 메소드
	public static List<MemberDto> getList() {
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
}
