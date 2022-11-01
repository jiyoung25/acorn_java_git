package test.mypac;

//나만의 Exception 만들기~
public class WowException extends RuntimeException {
	//생성자 만들기
	public WowException(String msg) {
		super(msg);
	}
}
