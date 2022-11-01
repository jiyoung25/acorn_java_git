package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자입력: ");
		//숫자 형식의 문자열을 입력받는다."10","20","10.1" 등등
		String inputNum=scan.nextLine();
		try {	
			//입력한 숫자(문자열로 받아냈음)를 실제 숫자로 바꾼다.
			double num=Double.parseDouble(inputNum);// 그러나, 문자를 집어넣으면 NumberFormatException이 발생한다.
			//입력한 숫자에 100을 더한다.
			double result=num+100;
			System.out.println("입력한 숫자+100: "+result);
		} catch(NumberFormatException nfe/* 지역변수. 아무거나 써도 됨*/) {
			/*
			 * 실행 스택에서 일어난 일을 콘솔창에 출력하기
			 * (자세한 예외 정보를 예외 객체가 콘솔창에 출력하게 하기
			 */
			nfe.printStackTrace();
		}
		
		System.out.println("무언가 중요한 마무리 작업을 하고 main메소드가 종료됩니다.");
		}
}
