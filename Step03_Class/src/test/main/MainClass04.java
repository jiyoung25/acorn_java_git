package test.main;

import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Member 객체를 생성해서
		Member m1=new Member();
		
		//2. 회원 한명의 정보를 담고
		m1.number=1;
		m1.name="김회원";
		m1.addr="강남구";
		
		//3. showInfo()메소드를 호출해보세요.
		m1.showInfo();
	}

}
