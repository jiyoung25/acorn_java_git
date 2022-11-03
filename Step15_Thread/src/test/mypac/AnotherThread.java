package test.mypac;

import java.awt.event.ActionEvent;

public class AnotherThread extends Thread {
	/*
	 * 새로운 스레드 만드는 방법
	 * 
	 * 1. Thread Class를 상속으로 받은 클래스를 정의한다. 2. run() 메소드를 오버라이드 ㅏㄴ다한다 3. run안에서 새로운
	 * 스레드에에서 해야 할 작업을 코딩한다. 4.만든 클래스 객체를 생성하고 해당 객체의 start() method를 호출하면 새로운 스레드가
	 * 시작된다.
	 * 
	 * 
	 */

	public void run() {
		System.out.println("작업을 시작합니다.");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println("작업이 끝났습니다.");

	}
}
