package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream is=System.in;
		//MainClass01과는 달리 한글도 처리 가능
		//inputStream의 기능 upgrade -> InputStreamReader
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.print("입력: ");
		try {
			int code=isr.read();
			System.out.println("code: "+code);
			char ch=(char)code;
			System.out.println("char: "+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
