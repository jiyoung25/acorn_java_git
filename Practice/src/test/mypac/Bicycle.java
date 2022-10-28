package test.mypac;

public abstract class Bicycle extends Bike {
	
	public int num;
	public String name;
	
	public Bicycle(Electric electric, Power power, Part part) {
		
		super(electric, power, part);
		System.out.println("Bicycle 생성자 호출됨");
		
	}
	
	public abstract void prepareBike(String name);
	
	public void bikeRider() {
		
		this.name=name;
		System.out.println(num+"개의 자전거를 가진 "+name);
	}
	
	
}
