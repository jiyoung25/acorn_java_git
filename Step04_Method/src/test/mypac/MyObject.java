package test.mypac;
/*
 * [메소드를 만들 때 고려해야 하는 것]
 * 
 * 1. 접근 지정자
 * 2. static or non static
 * 3. return type
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자(매개변수)의 개수와 data type
 */

public class MyObject {
	
	//void는 'return type이 없다.'라는 뜻
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	public int getNumber() {
		return 10;
	}
	public String getGreeting() {
		return "안녕하세요";
	}
	

}
