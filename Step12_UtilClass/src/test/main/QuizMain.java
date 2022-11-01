package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		// sample 데이터
		// HashMap은 Map interface를 받아서 많이 사용한다.
		Map<String, String> dic = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		System.out.print("검색할 단어를 입력해주세요: ");
		String word = scan.nextLine();
		// 입력받은 단어를 Map의 key값으로 활용해서 value읽어오기
		String mean = dic.get(word);
		boolean isExist = dic.containsKey(word);
		boolean isQ=word.contains("q");
		boolean isRealQ=word.equals("q");
		while (true) {
			if (word.isBlank()||isRealQ) {
				System.out.println("검색이 종료됩니다.");
				break;
			} else if (!isExist) {
				System.out.println(word + "는 목록에 없습니다.");
			} else if (isExist) {
				System.out.println(word + "의 뜻은 " + mean + "입니다.");
			}
		}
	}
}
