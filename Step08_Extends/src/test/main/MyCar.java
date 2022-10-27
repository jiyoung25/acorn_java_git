package test.main;

import test.auto.Wheel;
import test.auto.ElectricCar;
import test.auto.Engine;
import test.auto.OpenCar;

public class MyCar {
	public static void main(String[] args) {
		OpenCar myCar = new OpenCar(new Engine(), new Wheel());
		
		myCar.charge();
		myCar.drive();
		myCar.run();
	}

}
