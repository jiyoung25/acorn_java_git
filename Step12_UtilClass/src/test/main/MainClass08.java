package test.main;
/*
 * while문을 활용해서 원하는 횟수만큼 반복하기
 * 
 * - 반복 횟수가 명확히 정해져있으면 for문으로 반복문을 도는 것이 좋다.,
 *   반복 횟수가 명확히 정해져있지 않고 반복을 돌아봐야 횟수를 아는 경우는 while문으로 반복문을 도는 것이 좋다.
 */

public class MainClass08 {
	public static void main(String[] args) {
		
		//1. while문 사용 방법1
		int count=0;
		//무한루프 돌아줘!
		while(true) {
			System.out.println("안녕~^_^");
			count++;
			if(count==5) {
				break; //while문을 빠져나가줘!
			}
		}
		System.out.println("--------");
		
		//2. while문 사용 방법2
		count=0; //-> count를 다시 0으로 만드는 작업
		//카운트가 5보다 작은 동안에 반복문 수행해줘 ! (for문과 비슷하다.)
		while(count<5) {
			System.out.println("안뇨옹~^0^");
			count++;
		}
		
		System.out.println("--------");
		//3. while(true)와 똑같은 for문. for(;;)=while(true)
		for(;;) {
			
		}
	}
}
