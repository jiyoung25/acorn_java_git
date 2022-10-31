package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 ArrayList객체를 생성해서 참조값을 List interface type의 지역변수 nums에 담기
		//ArrayList에는 기본data type은 담지 못한다. List<int>는 존재하지 않는다는 뜻. 왜? 객체로 활용해야 하니까
		List<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		nums.add(70);
		nums.add(80);
		nums.add(90);
		nums.add(100);
		nums.add(110);
		
		
		//확장 for문을 이용해서 저장된 정수를 순서대로 콘솔창에 출력하기
		for(int tmp:nums) {
			System.out.println(tmp);
		}
		//forEach사용해서 순서대로 콘솔창에 출력하기
		nums.forEach((t)->{
			System.out.println(t);
			});
	}
}
