package test.mypac;

public class Vehicles {
	
	private Bike bike;
	private Car car;
	
	public Vehicles(Electric electric, Power power, Part part) {
		System.out.println("Vehicles 냥냥이 생성자 호출");
	}
	
	public Vehicles(Bike bike, Car car) {
		System.out.println("Vehicles생성자 호출");
		this.bike=bike;
		this.car=car;
	}
	
	public void howMany() {
		int b=car.num2;
		int a=car.num1;
		System.out.println(bike.num+"개의 2륜 자동차와"+car.carNum(a, b)+"개의 자동차가 있습니다.");
	}

}
