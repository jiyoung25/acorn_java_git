package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main method가 시작되었습니다.");

		// run을 하더라도 원하는 시간만큼 실행의 흐름 잡기
		//Thread는 import 해오지 않아도 된다.
		//이 문법을 사용할 때에는 try catch 문법으로 exception을 꼭 설정해주어야 한다.
		try {
			/*
			 * 실행의 흐름을 thread라고 하는데 스레드를 임의로 5초동안 잡아두기
			 * 컴파일시에 발생하는 Exception이 발생하기 때문에 반드시 try~catch블럭으로
			 * 예외처리를 해야한다.
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			//InterruptedException은 compile중 생기는 오류이므로, 예외처리 과정이 꼭 필요하다.
			e.printStackTrace();
		} // n/1000 sec 단위. (n ms단위)

		System.out.println("main method가 종료됩니다.");
	}
}
