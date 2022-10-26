package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 0~10사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고싶다.
		 */
		
		//방법1 : Math함수 사용
		System.out.println(Math.floor(Math.random()*10));
		
		//방법2 : Java에 기본적으로 내장되어있는 Random Class를 import해와서 사용
		Random random = new Random();
		int ranNum=random.nextInt(0, 10);
		System.out.println(ranNum);
		
		
		// 1~45사이의 랜덤한 정수 하나를 얻어내서 ranNum2라는 지역변수에 담아보세요.
		int ranNum2=random.nextInt(1,46); //1이상 46미만이라는 뜻
		
		//true or false중에 랜덤한 boolean값을 얻어내서 isRun이라는 지역변수에 담아보세요.
		boolean isRun= random.nextBoolean();
	}
}
