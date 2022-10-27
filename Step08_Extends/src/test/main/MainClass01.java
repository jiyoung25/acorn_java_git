package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Phone Class를 상속받은 HandPhone Class로 객체를 생성해서
		 * 그 참조값을 p1이라는 이름의 지역변수에 담기
		 */
		HandPhone p1 = new HandPhone(); //핸드폰의 생성자를 호출하면 폰의 생성자도 호출된다,
		/*
		 * HandPhone Class의 생성자를 호출해서 객레체를 생성했더니
		 * Phone의 생성자도 함께 호출되는 것을 알 수 있다.
		 * 
		 * 따라ㅓ, HandPhone 객체도 생성되고 Phone객체도 같이 생상된다는 것을 유추할 수 있다.
		 * 
		 * Phone객체와 HandPhone객체가 생성되어서 같은 사물함에 들어간다.
		 * 
		 * 즉, 하나의 참조값으로 phone의 기능, HandPhone의 기능을 모두 사용할 수 있다.
		 */
		
		p1.call(); // 자식은 부모의 것을 사용할 수 있다.
		p1.mobileCall();
		p1.takePicture();
	}
}
