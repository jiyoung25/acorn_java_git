package test.mypac;

public class CountThread extends Thread {
	public void run() {
		//카운트 값을 저장할 지역변수를 만들고 초기값을 대입
		int count=10;
		while(true) {
			System.out.println("현재 카운트: "+count);
			if(count==0) {
				break;
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			count--;
		}
	}
}
