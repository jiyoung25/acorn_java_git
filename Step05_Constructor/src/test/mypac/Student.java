package test.mypac;
/*
 * [생성자]
 * 
 * 1. 클래스명과 동일하다
 * 2. 메소드 모양과 유사하지만 return type이 없다.
 * 3. 객체를 생성할 때(new할 때) 호출된다.
 * 4. 객체를 생성하는 시점에 무언가 준비 작업을 할 때 유용하다.
 * 5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주된다.
 */

public class Student {
	/*
	 * public Student(){ }
	 * 위가 기본 생성자이다. 기본 생성자를 생성하지 않더라도 다른 class파일에서
	 * Student s1 = new Student(); 이런식으로 불러올 수 있다.
	 */

	public Student() {
		System.out.println("Student 클래스의 생성자 호출됨");
	}
	

}
