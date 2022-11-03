package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입력, 출력(Input, Output)
 * 
 *  - 어떤 대상으로부터 데이터를 메모리로 읽어 들이는 것을 입력이라고 한다.
 *  - 프로그래밍 언어의 관점에서 메모리라는 것은 변수or필드or객체로 생각하면 편하다.
 *  - 데이터는 2진수로 이루어져있지만, 2진수 8개의 묶음인 1byte단위로 생각하면 편하다.
 *  - 1byte는 총 256가지의 값을 표현할 수 있다.는 뜻이다.
 *  - 1byte를 10진수를 환산하면 0-255사이의 숫자 중 하나이다.
 *  - 입력과 출력을 통해서 이동하는 데이터는 byte(byte알갱이)하나 하나가 이동한다고 생각하면 된다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		//IntStream객체는 1byte단위 처리 스트림이다. (그러므로 256가지 코드가 존재함)
		//영문자, 대소문자, 숫자, 특수문자만 처리 가능 (한글 처리 불가)
		InputStream kbd = System.in;
		try {
			int code = kbd.read(); //char을 읽을 수 있다. 읽어내는 것은 char의 code값
			System.out.println("code: " + code);
			char ch=(char)code;
			System.out.println("char: "+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
