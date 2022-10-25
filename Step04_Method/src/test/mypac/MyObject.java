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
	
	//Car type을 리턴해주는 메소드
	//같은 패키지 안에 있으므로 import 하지 않고 와도 그냥 쓸 수 있다.
	public Car getCar() {
		return new Car();
	}
	
	// int type을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		System.out.println("num: "+num);
	}
	//String type을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		System.out.println("name: "+name);
	}
	//Car type을 메소드의 인자로 전달 받는 메소드
	public void useCar(Car car) {
		car.drive();
	}
	
	// 3개의 type을 메소드의 인자로 전달받는 메소드
	public void doSomethig(int um, String msg, Car c) {
		System.out.println("무언가를 작업합니다.");
	}
	
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	public void send(int num) {
		System.out.println(num+"을 전송해요");
		
	}
	public void send(String name) {
		System.out.println(name+"을 전송해요");
	}
	public void send(Car car) {
		System.out.println("자동차를 전송해요");
	}
	public String send(boolean istrue) {
		String yesOrno = istrue? "무언가를 전송해요.":"무언가의 전송에 실패했어요.";
		return yesOrno;
	}
}
