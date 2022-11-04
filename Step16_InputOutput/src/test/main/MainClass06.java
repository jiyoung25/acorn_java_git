package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream객체를 부모type OutputStream으로 받아보기
		//OutputStream도 1byte처리 스트림이다.
		OutputStream os=ps;
		//2바이트 처리스트림
		OutputStreamWriter osw=new OutputStreamWriter(os);
		//조금 더 좋은 기능을 가지고 있는 BufferedWriter객체 사용해보기
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("하나\r\n"); //\r\n:개행기호
			bw.write("두울");
			bw.newLine(); //개행기호만 전문적으로 출력해주는 메소드
			bw.write("세엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw2= new BufferedWriter(new OutputStreamWriter(System.out));
	}

} 
