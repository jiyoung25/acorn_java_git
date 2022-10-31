package test.main;

import java.util.HashMap;

/*
 * [HarshMap]
 * java에서 어떤 data를 key:value의 쌍으로 관리하고 싶으면 HashMap 객체를 사용한다.
 * key의 generic도 마음대로 지정할 수 있지만, 보통 (특별한 이유가 없다면 90%이상)String type으로 사용한다.
 * value의 generic은 그때그때 다르지만 value가 여러가지 type이면 보통 value는 Object type으로 지정한다.
 *    (why? object type에는 숫자(Integer, 문자열(String), Boolean type, new Scanner(); 등등 모두 담을 수 있다.)
 *    
 * javascript의 object type( {key:value, key1:value1, key2:value2....}와 닮았다.
 */

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 번호: 1
		 * 이름: 김구라
		 * 남자인지 여부: true
		 */
		HashMap<String, Object> map1=new HashMap<>();
		//map1.getOrDefault("번호", 1); //저장된 키값을 가지고 오는 것.
		map1.put("num", 1); //"번호"라는 key에 1이라는 value를 담는다.
		map1.put("name", "김구라");
		map1.put("isMan", true);
		
		
		/*
		 * value의 Generic class가 object로 지정되어있기 때문에
		 * 리턴되는 Object type을 원래 type으로 casting 해주어야 한다.
		 */
		int n= (int)map1.get("num");
		String name=(String)map1.get("name");
		Boolean isMan=(Boolean)map1.get("isMan");
		
		//동일한 key값으로 다시 담으면 그 key 값에 해당하는 value가 수정됨
		map1.put("name", "에이콘");
		
		//특정 key값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false리턴
		map1.remove(isMan);
		
		//모두 삭제
		map1.clear();
	}

}
