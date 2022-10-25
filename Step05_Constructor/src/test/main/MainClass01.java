package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		//아래에는 Student클래스의 기본 생성자를 호출해서 객체를 생성하고 참조값을 s1이라는 이름의 지역변수에 담기라는 뜻이 있다.
		Student s1 = new Student();
		//new Student();를 s1에 넣을 때 console창 보면 Student();의 내용이 불려오는 것을 볼 수 있음.
		s1.study();
	}
}
