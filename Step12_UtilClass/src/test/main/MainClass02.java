package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass02 {
	public static void main(String[] args) {
		//ArrayList객체를 생성해서 List interface type인 지역변수에 참조값 담기
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		//반복문을 돌면서 친구 이름을 순서대로 콘솔창에 출력해보기
		//방법1. Consumer interface를 이용
		System.out.println("--------------Consumer interface사용-------------");
		Consumer<String> con= new Consumer<>() {
			public void accept(String t) {
				System.out.println(t);
			}
		};
		//이걸 람다식으로 표현하면
		Consumer<String> con1=(name)->System.out.println(name);
		names.forEach(con);
		//이걸 굳이 변수에 담아야하나?
		System.out.println("-------------Consumer interface사용2-------------");
		names.forEach((t)->{
			System.out.println(t);
		});
		//이걸 굳이 변수에 담아야하나?2
		names.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
		//방법2. 일반 for문
		System.out.println("-------------------일반 for문 사용-----------------");
		for(int i=0; i<names.size(); i++) {
			String tmp=names.get(i);
			System.out.println(names.get(i));
		}
		System.out.println("-------------------확장 for문 사용-----------------");
		//방법3. 확장 for문
		for(String tmp:names) {
			System.out.println(tmp);
		}
		
	}

}
