package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		//0~4사이의 랜덤한 정수 얻어내기
		int ranNum=ran.nextInt(5);
		
		//우연히 가장 큰 수가 나오면 WowException을 발생시키기
		if(ranNum==4) {
			//throw + new 예약어를 사용해서 Exception을 발생시킬 수 있다.
			throw new WowException("놀랍네 이거...");
		}
		System.out.println("main method가 종료됩니다.");
	}
}