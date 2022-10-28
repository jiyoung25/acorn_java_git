package test.main;

import test.mypac.Myweapon;
import test.mypac.Weapon;


/*
 * 
 * -Class예약어 앞에 abstract를 명시해서 클래스를 정의한다.
 * -형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할 수 있다.
 * -형태만 정의된 메소드를 만들 때에는 abstract예약어를 붙여서 메소드를 정의한다.
 * -생성자는 존재하지만 단독으로 객체 생성은 불가능하다.
 * -추상클래스 type의 id가 필요하다면 추상클래스를 상속받은 자식클래스를 정의하여 객체를 생성(override)해야 한다.
 * -추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 오버라이드(재정의)해야 한다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		//추상클래스도 data type의 역할을 할 수 있다.
		Weapon w1=null;
		/*
		 * Weapon w2=new Weapon();은 성립하지 않는다. 추상클래스 단독으로 객체는 생성할 수 없다는 뜻이다.
		 * 왜냐? w2.attack();을 실행할 수 없기 때문에.( w2.attack()은 추상형이다.)
		 */
		Weapon w2=new Myweapon();
		w2.prepare();
		w2.attack();
		
		
	}

}
