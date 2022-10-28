package test.mypac;

public class Zoo {
	//내부 클래스(inner class): 클래스 안의 클래스
	public class Monkey{
		//Monkey Class의 메소드
		public void say() {
			System.out.println("안녕! 나는 원숭이야~");
		}
	}
	
	//내부 클래스(inner class)
	public class Tiger{
		//Tiger Class의 메소드
		public void say() {
			System.out.println("안녕! 나는 호랑이야~~");
		}
	}
	
	//Zoo Class의 메소드 
	public Monkey getMonkey() {
		return new Monkey();
	}   // ==>> 공개된 접근 지정자, Monkey type을 리턴하라, getMonkey()가 이 메소드의 이름이다.
	public Tiger getTiger() {
		return new Tiger();
	}  // ==>>  공개된 접근 지정자, Tiger type을 리턴하라, Tiger()가 이 메소드의 이름이다.
	
	public int num() {
		return 1;
	}
}
