package test.mypac;

public class Bicycle extends Bike {
	
	public int num;
	public int name;
	
	public Bicycle() {
		System.out.println("Bicycle 생성자 호출됨");
	}
	
	public void bikeRider() {
		System.out.println(num+"개의 자전거를 가진 "+name);
	}
	
	
}
