package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 
		 * 지역변수나 필드 앞에 선언하는 data type은 (참조 data type)
		 * 그 안에 들어있는 참조값의 사용설명서라고 생각하면 된다.
		 * 그렇기 때문에 그 지역변수나 필드에 .을 찍으면 사용설명서에 명시된 기능만 사용할 수 있다.
		 * java의 모든 객체는 다형성을 가질 수 있다.
		 * 다형성은 type이 여러개라는 의미이다.
		 * 
		 */
		
		//다형성 확인!!↓↓↓
		HandPhone p1=new HandPhone();
		
		//어떤 객체의 참조값을 부모 type으로 받을 수 있다!!↓
		Phone p2=new HandPhone(); //새로운 자식타입을 만들면서 부모타입으로 받을 수 있다.
		
		Object p3=new HandPhone(); //Object type은 모든 타입의 조상님이다.
		//p3에는 HandPhone라는 객체가 있지만, 이 안에 HandPhone의 기능은 없고 Object의 기능만 있다. 
		//한 객체는 다양한 타입일 수 있따! 더 큰 범위범위범위
		
		//p1.call();은 됨. 자식은 부모의 것을 사용할 수 있다.
		//p2.mobilePhone();은 안됨. 부모는 자식의 것을 사용할 수 없다.
		
		//자식 type에 부모type을 객체로 받아도 생성자는 모두 호출된다.
	}

}
