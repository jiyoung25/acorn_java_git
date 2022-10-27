package test.auto;

/*
 *  - 접근지정자 접근범위
 *  public: 어디에서나 접근 가능
 *  protected: 동일한 package 혹은 상속관계에서 자식에서 접근 가능
 *  default: 동일한 package안에서만 접근 가능
 *  private: 동일한 클래스 혹은 동일한 객체 안에서만 접근 가능
 *  
 *  
 *  - 접근 지정자를 붙이는 위치
 *  1. 클래스를 선언할 때
 *  2. 생성자
 *  3. 필드
 *  4. 메소드
 *  
 *  클래스는 default와 public 두가지의 접근 지정자만 지정이 가능하다.
 *  접근 지정자를 생략한 것이 default접근 지정자이다.
 */

public class Car {
	
	//field
	protected Engine engine;
	protected Wheel wheel;
	//Engine 객체를 인자로 받는 생성자
	public Car(Engine engine, Wheel wheel) {
		
		//생성자로 전달받은 Engine객체의 참조값을 필드에 저장하기
		
		this.engine=engine;
		this.wheel=wheel;
		
	}
	
	//메소드
	public void drive() {
		if(this.engine==null||this.wheel==null) {
			System.out.println("Engine객체가 없어서 달릴 수 없어요.");
			return;
		}
		System.out.println("부릉부릉 달려가요");
	}

}