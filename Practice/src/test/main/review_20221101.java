package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class review_20221101 {
	public static void main(String[] args) {

		Set<String> animal = new HashSet<>();
		animal.add("고양이");
		animal.add("강아지");
		animal.add("호랑이");
		animal.add("곰");
		animal.add("사막여우");

		// HashSet 정렬방법 1. Iterator 인터페이스 이용
		System.out.println("---------1----------");
		Iterator<String> iter = animal.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// HashSet 정렬방법 2. ArrayList Class + Collections Class 이용
		// 이 방법은 무작위로 들어갔던 HashSet의 참조값들이 정렬됨 (오름차순)
		// List, ArrayList, Collections import해야함
		System.out.println("---------2----------");
		List<String> str = new ArrayList<>(animal);
		Collections.sort(str);
		System.out.println(str);

		// HashSet 정렬방법 3. String객체의 메소드 이용
		// import아무것도 안해와도 됨
		System.out.println("---------3----------");
		System.out.println(String.valueOf(animal));

		// HashSet 정렬방법 4. Set interface의 iterator() 메소드 이용 (+while문도 같이 이용해야됨..근데 귀차늠
		// ㅎㅎ)
		System.out.println("---------4----------");
		System.out.println(animal.iterator().next());

		// HashSet 정렬방법 5. forEach함수 이용
		// Consumer import
		System.out.println("--------5-1---------");
		animal.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("--------5-2---------");
		animal.forEach((t)->System.out.println(t));
		
		//HashSet 정렬방법 6. stream()이용
		//HashSet에 Collection interface가 내장되어있고, Collection 안에 stream()메소드가 내장되어있으므로 또다른 import필요없음
		System.out.println("---------6----------");
		System.out.println(animal.stream().sorted().toString().valueOf(animal));
		//위의 sorted 이후로 3,4,5 이용하면 정렬된 HashSet 값을 얻을 수 있다.
	}
}
