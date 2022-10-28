package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	
	
	//ctrl+space로 쉽게 form을 만들 수 있다.
	Weapon w1=new Weapon() {
		
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			
		}
	};
	public static void main(String[] args) {
		Weapon w2=new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		};
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("안뇽안뇽 공격할게 >ㅇ<");
			}
		});
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
