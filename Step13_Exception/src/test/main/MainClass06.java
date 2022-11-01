package test.main;

	import test.mypac.MyUtil;
	
public class MainClass06 {
	public static void main(String[] args) {
		//내부에서 발생한 예외가 이미 MyUtil Class에서 처리되어있다.
		MyUtil.draw();
		
		//사용자가 직접 예외를 고쳐야 한다.
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
