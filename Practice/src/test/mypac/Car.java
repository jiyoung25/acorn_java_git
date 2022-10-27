package test.mypac;

public class Car extends Vehicles{
	
	int num1;
	int num2;
	
	public Car(Electric electric, Power power, Part part) {
		
		super(electric, power, part);
		System.out.println("Car생성자 호출됨");
	}
	
	public int carNum(int a, int b) {
		int num1=a;
		int num2=b;
		return a+b;
	}
	
	public void buy(Car carNum) {
		System.out.println(carNum+"개의 차를 샀어요");
	}

}
