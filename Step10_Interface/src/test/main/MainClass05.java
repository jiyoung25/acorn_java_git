package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1=new Joinner() {
			public String join(String one, String two) {
				return one+two;
			}
		};
		String result1=j1.join("안녕 ", "하세요.");
		
		
		//( ) -> { };은 매개변수의 type은 생략 가능하다. (이름만 잘 적으면 된다.)
		Joinner j2=(one, two)->{
			String answer=one+two;
			return answer;
			};
		String result2=j2.join("안녕","하세요");
		
		//메소드 안에서 특별히 실행할 코드가 없다면 아래와 같이 중괄호를 생략하고 리턴할 값만 명시하면 된다.
		Joinner j3=(one,two) -> one+two; //이것을 람다식 코딩이라고 부른다.
		String result3=j3.join("안녕",", 배고파?");
	}

}
