package test.mypac;

public class MotoCycle extends Bike {
	
	public MotoCycle(Electric electric, Power power, Part part) {
		
		super(electric, power, part);
		System.out.println("MotoCycle 생성자가 호출됨");

	}
	
	public void accident() {
		System.out.println("사고가 났습니다.");
	}
	


}
