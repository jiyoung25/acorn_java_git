package test.mypac;

public class HandPhone extends Phone {
	//Object에서 상속받은 phone를 상속받은 handphone
	
	public HandPhone() {
		System.out.println("HandPhone생성자 호출됨");
	}
	
	//메소드
	public void mobileCall() {
		System.out.println("이동 중에 전화를 걸어요");
	}
	//사진찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요.");
	}

}
