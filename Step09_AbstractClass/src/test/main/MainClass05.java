package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {

	// 필드를 선언하면서 값을 대입하는 코드
	int num = 999;
	String name = "kim";
	Scanner scam = new Scanner(System.in);

	// 필드는 선언만 하면 기본 값이 들어간다.
	int weight; // 0
	String msg; // null
	Scanner scan2; // null
	// static영역에 올리고 싶은 필드는 static예약어를 이용해서 만든다.
	static String greet = "안녕";
	static boolean isRun;// false(boolean의 기본 값은 false이다.)

	static Weapon w1;// null

	// field영역에서 추상화된 method가 있는 Weapon Class를 변수에 담기.
	// Anonymous Inner Class를 이용해서 Weapon type의 참조값 얻어내기.
	static Weapon w2 = new Weapon() {
		// 메소드 오버라이드
		public void attack() {
			System.out.println("무엇인지 모르겠지만 공격하자");
		}
	};

	public static void main(String[] args) {
		// useWeapon(w1); //오류남. 왜? 객체에서 null은 key가 만들어지지 않는다.
		useWeapon(w2);

		// Anonymous Local Inner Class를 이용해서 Weapon type의 참조값 얻어내기
		Weapon w3 = new Weapon() {
			public void attack() {
				System.out.println("저기를 공격하자");
			}
		};

		useWeapon(w3);

		// 굳이 변수를 만들지 않고 매개변수를 한번에 만드는 방식
		useWeapon(new Weapon() {
			public void attack() {
				System.out.println("저기를 공격하자");
			}
		});
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
