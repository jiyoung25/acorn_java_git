package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
	public static void main(String[] args) {
		//sample 데이터
		//HashMap은 Map interface를 받아서 많이 사용한다.
		Map<String, String> dic=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		System.out.print("검색할 단어를 입력해주세요: ");
		String scan1=scan.nextLine();
		//입력받은 단어를 Map의 key값으로 활용해서 value읽어오기
		String mean=dic.get(scan1);
		if(mean!=null) {
			System.out.println(scan1+"의 뜻은 "+mean+"입니다.");
		} else {
		System.out.println(scan1+"는 목록에 없습니다.");
		}
	}
}
