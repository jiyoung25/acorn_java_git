package test.main;

import java.util.Scanner;

public class WhyNull {
	
	public static void main(String[] args) {
	//1. 문자열을 저장할 수 있는 방 5개짜리 배열객체를 생성해서 참조값을 msgs라는 지역변수에 담는다.
	String[] msgs = new String[5];

	// 2.키보드로부터 입력받을 수 있는 Scanner객체를 생성해서 참조값을 scan이라는 지역변수에 담는다.
	Scanner scan = new Scanner(System.in);

	
	// 3. 반복문을 위에서 생성한 배열의 방의 개수만큼 돌면서 키보드로부터 문자열을 입력받아서 배열에 순서대로 저장한다.

	/*
	 for(String tmp:msgs) {
	 
	 System.out.print("msgs를 순서대로 5번 적어주세요.: "); String line=scan.nextLine();
	 tmp=line;
	 
	 }
	 */
	 
	
	
	for(int i=0;i<msgs.length;i++) {
		
		System.out.print("문자열 입력: ");
		String line=scan.nextLine();
		msgs[i]=line;
		
	}
	
	
	
	/*
	 * 주석처리 된 부분(a)은 작동하지 않고,
	 * 주석처리 되지 않은 부분(b)은 작동하는 이유
	 * 
	 * msg[i]는 "문자열"이라는 참조값이 들어있다.
	 * 그러므로 msgs[i]=line이라는 것은 msgs라는 key값을 저장한 것이 아닌, 그저 문자열을 복사한 것에 지나지 않는다.
	 * 그러므로 a부분은 line이 자꾸 초기화 되는 것이다.
	 * 
	 * 반면, b에는 i라는 index가 존재한다.
	 * 그러므로 초기화 되지 않고 msgs[i]에 차곡차곡 저장되는 것이다.
	 * 
	 */
	

	// 4. 반복문을 돌면서 배열에 저장되었던 모든 문자열을 순서대로 콘솔창을 출력한다.
	for (String tmp : msgs) {
		System.out.println("결과는 " + tmp);
	}

}
	
}
