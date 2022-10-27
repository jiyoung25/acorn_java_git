package test.auto;

public class OpenCar extends ElectricCar {
	public OpenCar(Engine engine, Wheel wheel) {
		super(engine,wheel);
	}
	
	public void run() {
		System.out.println("차가 쌩쌩 달립니다.");
	}
	

}
