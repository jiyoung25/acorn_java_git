package test.main;

import java.util.Random;

public class QuizMain4 {
	public static void main(String[] args) {
		/*
		 * 3. 같은거 3개 나오면 점수 10점 부여하기
		 */

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

	}

}
