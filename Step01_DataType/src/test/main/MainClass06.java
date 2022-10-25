package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//지역변수는 값을 넣지 않고 선언만 하면 만들어지지 않는다.
		//(javascript에서는 선언부터 해도 됐었다.)
		int num1;
		String name1; 
		
		//!!!다시 강조!!!! num1과 name1은 만들어지지도 않은 변수이다.!!!!!
		//아직 만들어지지 않았기 때문에 num1은 참조 불가
		//int result=1+num1;  이런 것도 못만든다는 뜻!
		
		//아직 만들어지지 않았기 때문에 name1은 참조 불가
		//System.out.println("name1:"+name1); 이런거 안됨
		
		System.out.println("main메소드가 종료됩니다.");
	}

}
