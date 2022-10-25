package test.main;

import test.mypac.MyObject;
import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		
		/*
		 *  콘솔창에 "안녕하세요."를 출력하려고 한다.
		 *  
		 *  해당목표를 달성하려면 콘솔창에 출력을 할 수 있는 기능을 가진 객체가 필요하다.
		 *  
		 *  그 객체는 어디에 있나? System class의 out이라는 static field에 해당 객체의 참조값(키값)이 들어있다.
		 *  
		 *  그 객체는 무슨 type인가? PrintStream type이다.
		 *  
		 *  그 객체를 누가 생성했나? java에서 이미 생성해서 미리 준비된 객체이다.
		 *  
		 *  System class는 왜 import를 하지 않아도 사용할 수 있지? -> static이기 때문에.
		 *  
		 *  System, String 등의 class는 java.lang package에 있는 클래스이며 이미 해당 package에 있는 모든 class는
		 *  마치 기본 클래스처럼 import없이 사용할 수 있따.
		 *  
		 */
		
		//다중정의(overloading)된 println()메소드 사용해보기.
		System.out.println("안녕하세요.");
		System.out.println(999);
		System.out.println(true);
		System.out.println('a');
		
		MyObject obj1=new MyObject();
		Car car=new Car();
		//MyObject 객체의 다중정의된 메소드 사용해보기
		obj1.send();
		obj1.send(1);
		obj1.send("김구라");
		obj1.send(car);
		System.out.println(obj1.send(false));
	}

}
