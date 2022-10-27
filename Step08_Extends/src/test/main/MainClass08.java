package test.main;

import test.util.MyUtil;

public class MainClass08 {
	public static void main(String[] args) {
		MyUtil.clear(); // static method들도 다 상속받아 쓸 수 있다.
		MyUtil.send(); // 상속받은 메소드
		MyUtil.light();// 본인 것도 쓰는거 당연 가능
	}

}
