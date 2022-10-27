package test.mypac;

public class Bike extends Vehicles {
	
	public String whose;
	public String time;
	public int num;
	
	public Bike(Electric electric, Power power, Part part) {
		
		super(electric, power, part);
		System.out.println("Bike생성자 호출됨");
	}
	
	public void ride() {
		System.out.println("부릉부릉");
	}
	

}
