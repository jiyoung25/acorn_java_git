package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		//문자열을 1줄 입력 받을 수 있는 객체
		BufferedReader br=new BufferedReader(isr);
		System.out.print("문자열 한줄 입력: ");
		try {
			//BufferedReader객체의 readLine()메소드를 이용해서 문자열 한 줄을 읽어오기
			String line=br.readLine();
			System.out.println("line: "+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//위의 br을 만드는 3줄을 1줄로 압축
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	}
}
