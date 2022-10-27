package test.main;

import java.util.Random;
import java.util.Scanner;

public class TestMain{
	public static void main(String[] args) {
		int point=1000;
		Scanner scan=new Scanner(System.in);
		
		//엔터를 칠 때마다 포인트가 빠져나가고, 그림이 같은게 나오면 점수를 주는 게임 ( point가 0이 되면 끝나는 게임 )
		
		//while문은 false가 될 때까지 무한으로 반복한다. 그러므로 아래는 무한루프이다.
		while(true) {
			if(point==0) {
				break; //반복문 loop 탈출
			}
			System.out.println("Enter를 치세요");
			
			scan.nextLine();
			
			String[] msgs = { "cherry", "apple", "banana", "melon", "7" };
			Random ran = new Random();

			// for문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열 객체 생성
			int[] nums = new int[3];

			for (int i = 0; i < 3; i++) {
				int ranNum = ran.nextInt(5);
				System.out.print(msgs[ranNum]);
				if (i < 2) {
					System.out.print("|");
				}

				nums[i] = ranNum;

			}
			System.out.println("");
			boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
			boolean isTwoEqual = nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2];
			if (isEqual) {
				System.out.println("10점입니다.");
			} else if (isTwoEqual) {
				System.out.println("5점입니다.");
			} else {
				System.out.println("0점입니다.");
			}
			
			point -=10;
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
