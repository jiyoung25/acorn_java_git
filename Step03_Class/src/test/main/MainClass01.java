package test.main;

import test.mypac.Car;

//import로 다른 package파일 받아옴

/*
 * 자동 import하는 방법 2가지
 * 
 * 1. 클래스명을 작성하고 ctrl+space
 * 2. ctrl+shift+o
 */


public class MainClass01 {
	
	public static void main(String[] args) {
	
		//test.mypac패키지에 있는 car 클래스로 객체를 생성해서 참조값을 얻어냈지만 사용하지 않고 버리기
		new Car();
		//test.mypac패키지에 있는 car 클래스로 객체를 생성해서 참조값을 얻어내서 car1이라는 지역변수에 담기
		Car car1=new Car(); //Class명 자체가 data type의 역할을 한다.
		car1.name="소나타";
		car1.whose="혀니";
		car1.drive();
		car1.stop();
		//직접 설계한 drive와 stop method . 사용 complete!
		//객체를 사용하여 접근!!!!
		
		Car car2=new Car();
		car2.whose="서니";
		car2.name="람보루기니";
		car2.drive();
		car2.stop();
		car2.curve();
		
	}

}
