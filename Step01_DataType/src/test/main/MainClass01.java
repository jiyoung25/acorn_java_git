package test.main;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32,768 ~ 32,767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		@SuppressWarnings("unused")
		byte iByte=10;
		short iShort=10;
		@SuppressWarnings("unused")
		int iInt=10000;
		@SuppressWarnings("unused")
		long iLong=10;
		/*
		 * int type 변수에 byte type 변수에 담긴 내용을 대입한다면?
		 * -표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에
		 * 대입하는 것은 문제가 없다.
		 * -따라서 에러를 발생시키지 않는다.
		 */
		@SuppressWarnings("unused")
		int tmp=iShort;
		
		//byte tmp2=iInt -> 에러가 난다! 왜냐하면 너무 큰 수 넣으려 했음
		//만약 int의 숫자가 작았었다면 byte에 넣을 수 있다
		@SuppressWarnings("unused")
		byte tmp2=(byte)iShort;
		/* 
		 * (byte)는 캐스팅이다. 확실히 byte타입을 넘지 않을 것 같으면 사용한다.
		 * 큰 수 변수-> 작은 수 변수는 캐스팅을 해야만 가능하다.		
		 * 표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면
		 * 명시적으로 casting을 해야한다.
		 */

		
		//실수형 변수 선언하고 값 대입하기
		float num1=10.1f; //f는 float type이라는 뜻
		double num2=10.2d; // d는 double type이라는 뜻
		@SuppressWarnings("unused")
		double num3=10.3; //d,f를 붙이지 않으면 double type으로 간주된다.
		
		//float type에 있는 값을 double type에 담기
		@SuppressWarnings("unused")
		double tmp3=num1;
		
		//double type에 있는 값을 float type에 넣으려면 casting 연산자가 필요하다.
		@SuppressWarnings("unused")
		float tmp4=(float)num2;
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
