package test.dto;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class FriendDto {
	private int num;
	private String name;
	private String phone;
	private Date birth;
	
	public FriendDto() {
		
	}
	
	public FriendDto(int num, String name, String phone, Date birth) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(String birth) {

		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");

		// Date로 변경하기 위해서는 날짜 형식을 yyyy-mm-dd로 변경해야 한다.
		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");

		java.util.Date tempDate = null;
		try {
			// 현재 yyyymmdd로된 날짜 형식으로 java.util.Date객체를 만든다.
			tempDate = beforeFormat.parse(birth);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// java.util.Date를 yyyy-mm-dd 형식으로 변경하여 String로 반환한다.
		String transDate = afterFormat.format(tempDate);

		// 반환된 String 값을 Date로 변경한다.
		Date d = Date.valueOf(transDate);
		
		this.birth=d;
	}

}
