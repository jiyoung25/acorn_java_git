package test.main;

import java.util.Random;

/* 
 * 1. run했을 때 cherry, apple, banana, melon, 7
 * 5개의 문자열 중에서 1개가 랜덤하게 출력되게 해보세요.
 * 
 * 2. run했을 때 5개의 문자열 중에서 3개가 한 줄에 랜덤하게 출력되도록 해보세요
 * 
 */

public class Quiz1 {
	public static void main(String[] args) {
		String[] str= {"cherry","apple","banana","melon","7"};
		
		Random random=new Random();

		int nums[]= {0,0,0};
		
		//이 부분을
		for (int i=0; i<3; i++){
		int ranNum=random.nextInt(0,5);
		nums[i]=ranNum;
		}
		
		//여기에 넣어도 결과는 똑같다.
		for (int i=0; i<nums.length; i++) {
		System.out.print(str[nums[i]]+"|");
		}
		
		if(nums[0]==nums[1]&&nums[1]==nums[2]) {
			System.out.println("점수 획득 성공 !");
		} else {
			System.out.println("점수 획득 실패");
		}
	}
}
