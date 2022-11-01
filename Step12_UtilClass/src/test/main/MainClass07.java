package test.main;

import java.util.HashSet;
import java.util.Set;

/*
  * HashSet은 Set interface를 구현한 클래스이다.
  * 
  * - 순서가 없다.
  * - key값도 없다.
  * - 중복을 허용하지 않는다.
  * - 어떤 data를 묶음(집합)으로 관리하고자 할 때 사용한다.
  * - ex. 로또 구할 때
  * - 활용도가 많지는 않지만 중복을 제거한다는 특징 때문에 쓰일 때가 있다.
  */

public class MainClass07 {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);//두 번 넣는다고 공간을 2개 차지하진 않는다.
		//중복을 허용하지 않으므로, 하나의 20만 들어있다.
		set1.add(30);
		set1.add(30);
		
		//문자열을 저장할 수 있는 HashSet객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");
		
	}
}
