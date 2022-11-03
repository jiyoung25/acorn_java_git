package test.mypac;

public class MakeThread extends Thread {
	public void run() {
		int count=10;
		while(true) {
			if(count<0) {
				break;
			} else {
				try {
					System.out.println("카운트 다운: "+count);
					Thread.sleep(1000);
					count--;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
