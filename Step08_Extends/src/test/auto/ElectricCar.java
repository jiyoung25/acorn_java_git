package test.auto;

public class ElectricCar extends Car {
	//부모객체가 생성되기 위해서 필요한 객체를 자식 생성자의 매개변수로 전달받아서
	public ElectricCar(Engine engine, Wheel wheel) {
		//자식 생성자가 전달받은 인자를 부모 생성자에 전달을 해주어야 한다. (super로 받아냄)
		super(engine, wheel);//슈퍼 없으면 에러나~
	}
	
	public void charge() {
		System.out.println("충전을 해요!");
	}

}
