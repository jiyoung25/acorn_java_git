package test.main;
/*
 * [Java 기본 data type]
 * 2. 문자형(char)
 * -65,536 가지의 코드값을 가질 수 있다. (전 세계의 문자 1글자들)
 * -전 세계에서 사용하는 모든 문자 1글자를 표현할 수 있다.
 * -single quotation(싱글 따옴표)을 이용해서 만든다.
 * -두 글자를 대입하면 오류남
 */
public class MainClass04 {
	public static void main(String[] args) {
		//char형 변수 선언과 동시에 값 대입하기
		char ch1='a'; //char ch9='가나'는 안됨(두 글자)
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='나';
		char ch6='다';
		char ch7='@';
		char ch8='꿹';
		char ch9='ㄱ';
		char ch10=' ';
		char ch11='\n'; //엔터도.. char type에 들어간다..!
		//char에 넣은 문자를 정해진 숫자로 변환해 변수에 저장되는 방식이다. (출력시엔 다시 문자로)
		
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		int code5=ch5;
		int code6=ch6;
		int code7=ch7;
		int code8=ch8;
		int code9=ch9;
		int code10=ch10;
		int code11=ch11;
		//문자에 해당되는 숫자가 몇 번인지 알 수 있다.
	}
}
