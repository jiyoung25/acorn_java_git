package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		
		//HandPhone객체를 생성해서 그 참조값을 p1이라는 이름의 HandPhone type지역변수에 대입하기
		HandPhone p1=new HandPhone();
		
		//p1안에 있는 참조값을 p2라는 Phone type의 지역변수에 대입하기
		Phone p2=p1;
		
		//p1안에 있는 참조값을 p3라는 Object type 지역변수에 대입하기
		Object p3=p1;
		
		Object p4=p2;
		
		//객체는 new할 때 만들어지므로 객체는 1개가 만들어진 것이다.
		//지역변수가 p1, p2, p3로 3개가 만들어진 상태.
		//p1, p2, p3은 모두 같은 key를 공유하고 있다.
		
		//자식객체의 참조값은 부모 type의 변수나 field에 자연스럽게 담긴다.
		//그러나 MainClass2처럼 p2.mobilePhone();는 사용할 수 없다.
		
	}
}
