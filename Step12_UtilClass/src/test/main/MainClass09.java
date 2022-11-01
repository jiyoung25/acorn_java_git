package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");

		// 반복자(Iterator)객체 얻어내기(저장된 item을 일렬로 세우는 작업)
		Iterator<String> it = names.iterator();
		// 다음 자리에 값이 있어?
		boolean isExist = it.hasNext();
		// 반복문 돌기
		while (it.hasNext()) {
			// 값이 있으면 그 칸의 값을 읽어줘.
			String item = it.next();
			System.out.println(item);
		}
		
		//특정 item(데이터, 참조값)존재 여부 알아내기
		boolean isContain=names.contains("김구라");
		//저장된 item의 갯수
		int size=names.size();
		//특정 item 삭제
		names.remove("해골");
		//모든 item 삭제
		names.clear();

	}

}
