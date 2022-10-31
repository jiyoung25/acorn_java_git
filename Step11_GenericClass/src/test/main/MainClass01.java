package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//type이 정해지지 않은 Class의 type은 main method에서 정해진다.
		
		/*
		 * 객체 생성시 new부분의 Generic Class는 생략이 가능하다.
		 * 참조값을 field나 변수에 받을 때만 type을 정확히 지정하면 된다.
		 */
		FruitBox<Apple> box1= new FruitBox</* Generic 부분 */>();
		
		//setItem() 메소드를 호출하면서 field에 Apple type전달하기
		box1.setItem(new Apple());
		//getItem() 메소드를 호출해서 field에서 Apple type 리턴받기
		Apple a=box1.getItem();
		
		//Banana type으로 해보기
		FruitBox<Banana> box2=new FruitBox<>();
		box2.setItem(new Banana());
		Banana b=box2.getItem();
		
		//Orange type으로 해보기
		FruitBox<Orange> box3=new FruitBox<>();
		box3.setItem(new Orange());
		Orange o=box3.getItem();
	}

}
