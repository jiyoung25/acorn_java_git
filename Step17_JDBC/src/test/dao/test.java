package test.dao;

import java.text.SimpleDateFormat;

import test.dto.FriendDto;

public class test {
	public static void main(String[] args) {
		String birth="19990119";
		FriendDto dto=new FriendDto();
		dto.setBirth(birth);
		String a = new SimpleDateFormat("YYYYMMDD").format(dto.getBirth());
		System.out.println(a);
	}
}
