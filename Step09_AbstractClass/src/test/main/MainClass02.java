package test.main;

import test.mypac.Cannon;
import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	//run했을 때 실행의 흐름이 시작되는 특별한 main메소드
	public static void main(String[] args) {

		//동일 클래스 안에 있는 static 메소드 호출 가능
		test("안녕!!!!");
		Weapon w=new Cannon();
		useWeapon(w);
		Gun g1=new Gun(); //gun은 weapon의 자식이므로 gun으로 받아도 된다! (but, 부모인 Object로는 받지 못한다.)
		useWeapon(g1);
		
		
	}
	

	public static void test(String msg) {
		System.out.println(msg);
	}
	
	//인자로 전달된 Weapon type을 인자로 전달받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
