package test.main;
/*
 * [기본 data type의 참조 data type] (나중에 배열에 담을때 기본데이터는 담길 수 없어서 참조데이터로 포장한다.)
 * 
 * byte: Byte
 * short: Short
 * int: Integer
 * long: Long
 * 
 * float: Float
 * double: Double
 * 
 *  char: Character
 *  boolean: Boolean
 *  
 *   - 때로는 기본 data type의 참조데이터 type이 필요할 때가 많다.
 *   - 기본 데이터 type을 객체에 포장(boxing)하는 형태이다.
 *   - boxing과 unboxing은 자동으로되기 때문에 프로그래머가 신경쓸 필요는 없다.
 */


public class MainClass01 {
	public static void main(String[] args) {
		int num1=10;
		Integer num2=10; //참조 data type도 기본과 사용법이 똑같고, import해올 필요가 없다.
		
		num2.reverse(num1); //참조 datatype은 객체형으로 사용 가능하다.
		
		//참조 data type이지만 기본data type으로도 사용이 가능하다
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//문자를 숫자로 바꾸기(String type을 int type으로 바꾼 결과값 얻어내기)
		int result4 = Integer.parseInt("999");//Interger class의 static 메소드 활용
		System.out.println(result4);
	}

}
