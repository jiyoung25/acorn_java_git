package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서
		//참조값을 List interface type 지역변수 cars에 담아보세요.
		List<Car> car=new ArrayList<>();
		//2. Car객체(3개)를 생성해서 List 객체에 저장해보세요.
		Car c1=new Car("차1");
		Car c2=new Car("차2");
		Car c3=new Car("차3");
		car.add(c1);
		car.add(c2);
		car.add(c3);
		boolean a=car.isEmpty();
		
		//3. 반복문 for문을 이용해서 List객체에 저장된 모든 Car객체의 drive()메소드를
		//순서대로 호출해보세요.W
		for(int i=0; i<car.size(); i++) {
			car.get(i).drive();
		}
		//다른 방법
		for(Car tmp:car) {
			tmp.drive();
		}
		//다른 방법
		car.forEach((t)-> t.drive());
		
	}
}
