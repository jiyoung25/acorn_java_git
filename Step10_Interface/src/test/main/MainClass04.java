package test.main;

import java.util.ArrayList;
import java.util.List;
import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요.");
			}
		});
		
		//추상메소드가 1개인 인터페이스는 자바스크리트의 화살표함수처럼 표현할 수 있다.
		useDrill(()->{
				System.out.println("천장에 구멍을 뚫어요.");
		});
	}
	
	List list=new ArrayList();
	
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}
