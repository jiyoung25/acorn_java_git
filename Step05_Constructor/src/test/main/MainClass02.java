package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * Member m1=new Member();
		 * Student class에 생성자가 public Member (int xx, String aa, String aa)이렇게 인자를 넣는 방식만 있을 때
		 * 위대로 하면 에러남.
		 * 왜냐하면 Member에 만든 생성자에 정의된 값(매개변수에)이 있기 때문에.
		 * 위가 제대로 작동하기 위해서는 public Member(){ }이라는 기본 생성자 또한 필요하다.
		 * 
		 */
		//기본 생성자가 있어야 객체 생성이 가능함
		Member m1=new Member();
		m1.number=2;
		m1.name="해골";
		m1.addr="행신동";
		
		//값을 3개 전달하는 생성자를 호출하면서 객체 생성하기
		Member m2=new Member(1,"김구라","노량진");
		
		m1.showInfo();
		m2.showInfo();

	}

}
