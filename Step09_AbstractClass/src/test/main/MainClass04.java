package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	//내부클래스 //static영역에 있는 main method에 사용할 class를 새로 만든 것이므로 class 앞에 static이 없으면 오류가 난다.
	static class YourWeapon extends Weapon{
		//override
		public void attack() {
			System.out.println("공중 공격을 해요!");
			
		}
		
	}
	
	//메인클래스
	public static void main(String[] args) {
		
		Weapon w1=new YourWeapon();
		useWeapon(w1);
		
		//Local Inner Class // main method는 static이지만, local inner class이므로 static이 없어도 작동한다.
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("아무나 공격하자!");
			}
		}
		Weapon w2=new OurWeapon();
		useWeapon(w2);
		
		
	}
	//Weapon Class의 객체를 매개로 하는 메소드 // static영역에 있는 main method 안에 넣을 class이므로 static이 없으면 오류가 난다.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
