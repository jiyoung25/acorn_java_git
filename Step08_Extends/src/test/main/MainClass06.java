package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone();
		
		//엄마! 나도 SmartPhone이 가지고 싶어~~!ㅜㅜ
		//엄마가 새로운 설명서를 가지고 왔어 이제 그 폰은 SmartPhone이야.
		SmartPhone p2=(SmartPhone)p1;
		
		//진짜? 나 인터넷 한당~^ㅁ^~
		p2.doInternet();
		//but... error난다. ClassCastExeption으로..
		//원래 핸드폰이었던걸 강제로 스마트폰이라고 Casting 해버렸으니..
	}

}
