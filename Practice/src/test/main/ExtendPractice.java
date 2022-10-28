package test.main;

import test.mypac.Bike;

import test.mypac.Car;
import test.mypac.Bicycle;
import test.mypac.MotoCycle;
import test.mypac.Vehicles;
import test.mypac.Electric;
import test.mypac.ElectricBicycle;
import test.mypac.Part;
import test.mypac.Power;

public class ExtendPractice {

	public static void main(String[] args) {
		
		
		Electric electric=new Electric();
		Power power=new Power();
		Part part=new Part();
		
		MotoCycle motocycle = new MotoCycle(electric, power, part);
		Bike bike= new Bike(electric, power, part);
		Car car = new Car(electric, power, part);
		Bicycle bicycle=new ElectricBicycle(electric, power, part);
		ElectricBicycle electricbicycle=new ElectricBicycle(electric, power,part);
		Vehicles vehicles = new Vehicles(bike, car);
		
		motocycle.accident();
		
		Bike m1=motocycle;
		Vehicles m2=motocycle;
		m1.ride();
		bicycle.num=1;
		bicycle.name="이지현";
		bicycle.bikeRider();
		
		ElectricBicycle eb=(ElectricBicycle) bicycle;
		
		bicycle.prepareBike(null);
		eb.prepareBike(null);
	}

}
