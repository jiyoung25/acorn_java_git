package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member객체를 담을 수 있는 ArrayList객체를 생성해서 참조값을 members라는 지역변수에 담아보세요.
		List<Member> mem=new ArrayList<>();
		
		//2. 3명의 회원정보를 Member객체에 각각 담아보세요.
		Member mem1=new Member(1, "김회원", "노량진");
		Member mem2=new Member(2, "박회원", "마포구");
		Member mem3=new Member(3, "이회원", "강남구");
		//3. 위에서 생성된 Member객체의 참조값을 members List객체에 모두 담아보세요.
		mem.add(mem1);
		mem.add(mem2);
		mem.add(mem3);
		/*
		 * 4. members List객체에 담긴 내용을 이용해서 회원목록을 아래와 같은 형식으로
		 * 반복문을 돌면서 출력해보세요.
		 * 번호: 1, 이름: 김구라, 주소: 노량진
		 */
		//4-1
		System.out.println("4-1");
		for(int i=0; i<mem.size(); i++) {
			System.out.println("번호: "+mem.get(i).num+", 이름: "+mem.get(i).name+", 주소: "+mem.get(i).addr);
		}
		//4-2
		System.out.println("4-2");
		for(Member tmp:mem) {
			System.out.println("번호: "+tmp.num+", 이름: "+tmp.name+",주소: "+tmp.addr);
		}
		//4-3 forEach
		System.out.println("4-3-1");
		mem.forEach((t)->System.out.println("번호: "+t.num+", 이름: "+t.name+",주소: "+t.addr));
		
		System.out.println("4-3-2");
		//<>에 Generic Class 필수. 그래야 public void accept( )부분에서 Member type의 매개변수를 지정할 수 있다.
		mem.forEach(new Consumer<Member>() {
			public void accept(Member t) {
				System.out.println("번호: "+t.num+", 이름: "+t.name+",주소: "+t.addr);
			}
		});
		
	}
}
