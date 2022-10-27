package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		
		//MainClass3: 자식type을 부모type으로 받는 경우
		//MainClass4: 부모type을 자식type으로 받는 경우
		
		//HandPhone 객체를 생성해서 그 참조값을 Object type p3지역변수에 담는다
		Object p3=new HandPhone();
		//Phone p2=p3;    //error남 부모 type의 참조값을 자식 type에 담을 수 없다.
		//HandPhone p1=p3; //error남
		Phone p2=(Phone)p3; // Casting하면 부모 type의 참조값을 자식 type에 담을 수 있음. 단, 책임은 개발자가!
		HandPhone p1=(HandPhone)p3;//위와 동일 "야 이거 까보니까 HandPhone type이 확실해!! 다른 기능 없더라!! 그냥 담아! 내가 책임질게!"라는 뜻
		
		
		//왜 casting을 하느냐? 부모 type이 더 유연한 코딩이 가능! 부모 type으로 하다가 나중에 범위 좁히기 위해 casting을 하곤 한다.
	}

}
