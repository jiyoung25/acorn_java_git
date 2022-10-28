package test.mypac;

public class ElectricBicycle extends Bicycle {
	public ElectricBicycle(Electric electric, Power power, Part part) {
		super(electric, power, part);
	}
	
	public void prepareBike(String name) {
		
		this.name=name;
		System.out.println(name+"이 자전거를 준비합니다.");
		
	}

}
