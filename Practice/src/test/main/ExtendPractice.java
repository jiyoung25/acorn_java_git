package test.main;

import test.mypac.Bike;
import test.mypac.Car;
import test.mypac.Bicycle;
import test.mypac.MotoCycle;
import test.mypac.Vehicles;

public class ExtendPractice {

	public static void main(String[] args) {

		MotoCycle motocycle = new MotoCycle();
		Bicycle bicycle = new Bicycle();
		Bike bike= new Bike();
		Car car = new Car();
		Vehicles vehicles = new Vehicles(bike, car);
		
		motocycle.accident();
		
		Bike m1=motocycle;
		Vehicles m2=motocycle;

	}

}
