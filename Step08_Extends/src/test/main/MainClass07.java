package test.main;

import test.auto.ElectricCar;
import test.auto.Engine;
import test.auto.Wheel;

public class MainClass07 {
	
	public static void main(String[] args) {
		Engine engine=new Engine();
		/* 
		 * Car c1= new Car(engine); //Car객체를 생성하기 위해서는 반드시 Engine객체를 전달해주어야 한다. 
		 */
		
		ElectricCar car1=new ElectricCar(new Engine(), new Wheel()); //★★★★★엔진을 받아와야한다!
		car1.drive(); //Car Class의 메소드
		car1.charge();//Electric Car Class의 메소드
	}

}
