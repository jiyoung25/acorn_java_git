package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// static method는 new해서 변수에 담지 않고, 클래스명에 .찍고 바로 호출할 수 있다.
		MyUtil.send();
		// static field는 new해서 변수에 담지 않고, 클레스명에 .찍고 바로 호출할 수 있다.
		MyUtil.version="1.0";
		
		MyUtil.send();
	}

}
