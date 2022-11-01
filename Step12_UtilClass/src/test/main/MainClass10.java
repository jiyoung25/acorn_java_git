package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		//HashSet 객체에 정수를 
		Set<Integer> set1=new HashSet<>();
		set1.add(30);
		set1.add(20);
		set1.add(50);
		set1.add(10);
		set1.add(20);
		
		//ArrayList와 HashSet Class는 모두 Collection을 interface로 한다.
		//그러므로 new ArrayList를 만들면서 HashSet으로 만든 객체를 넣으면 통한다. (new ArrayList 생성자는 Collection을 인자로 받기도 한다.)
		//HashSet객체에 담긴 아이템을 순서있게 관리하도록 생성자의 인자에 넣어서 객체 생성하기
		List<Integer> list= new ArrayList<>(set1);
		Collections.reverse(list); //뒤집기!
		for(int tmp:list) {
			System.out.println(tmp);
		}
		System.out.println("---------");
		Collections.shuffle(list); //섞기!
		for(int tmp:list) {
			System.out.println(tmp);
		}
		System.out.println("---------");
		Collections.sort(list); //정렬하기!
		for(int tmp:list) {
			System.out.println(tmp);
		}
	}
}
