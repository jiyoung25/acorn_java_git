package test.main;

import test.mypac.Member;

/*
 * 1. 한 명의 회원 정보를 담을 수 있는 객체를 생성할 Membber Class를 test.mypac 패키지에 만들어보세요.
 * 
 * 회원 한 명의 정보는 번호, 이름, 주소로 이루어져 있다.
 * 따라서 3개의 필드를 적당한 data type을 선언해서 만들어야 한다.
 */

public class MainClass03 {
	public static void main(String[] args) {
		//2. Member class로 객체를 생성해서 참조값을 m1이라는 지역변수에 담아보세요.
		Member m1=new Member();
		//3. m1에 담긴 참조값을 이용해서 1, 김구라, 노량진이라는 정보를 객체에 저장해보세요.
		m1.number=1;
		m1.name="김구라";
		m1.addr="노량진";
		
		/*
		 * 위와 비슷한 작업을 javascript로 한다면?
		 * 
		 * let m1={};
		 * m1.num=1;
		 * m1.name="김구라";
		 * m1.addr="노량진";
		 * 
		 * or
		 * 
		 * let m1={num:1, name:"김구라", addr:"노량진"};
		 * 
		 */
		
		//2, 해골, 행신동이라는 회원 정보도 Member이라는 객체에 담아보세요.
		Member m2=new Member();
		m2.number =2;
		m2.name="해골";
		m2.addr="행신동";
		
		//m1 안에 있는 참조값을 이용해서 콘솔창에 김구라의 정보를 아래와 같은 형식으로 출력해보세요.
		System.out.println("번호: "+m1.number+", 이름: "+m1.name+", 주소: "+m1.addr);
		
	}

}
