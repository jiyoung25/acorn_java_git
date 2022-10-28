package test.mypac;

import java.util.Scanner;

public class Cannon extends Weapon {
	
	
	Scanner scan=new Scanner(System.in);
	
	public void attack() {
		
		System.out.print("초를 입력해주세요.: ");
		int n= scan.nextInt();
		System.out.println(n+"초 뒤에 적을 공격합니다.");
	}
	

}
