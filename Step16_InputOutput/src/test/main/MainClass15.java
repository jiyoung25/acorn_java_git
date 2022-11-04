package test.main;
//자바로 파일 이미지를 복제해보자!1

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass15 {
	static FileInputStream fis=null;
	static FileOutputStream fos=null;
	public static void main(String[] args) {

		try {
			// 파일에서 파일의 바이트를 읽을 수 있는 객체
			fis = new FileInputStream("c:/acorn202210/myFolder/bottle.png");
			// 읽어낸 바이트 알갱이를 출력할 객체
			fos = new FileOutputStream("c:/acorn202210/myFolder/copied.png"); // copied!
			int readByte=0;
			
			while(true) {
				//byte 읽는 방법 1. 숫자 하나하나 읽어내는 방법
				 // 숫자를 하나하나 읽어내기 때문에, 바이트가 큰 파일은 옮기는 데에 오래걸려 좋지 않은 방법니다.
				readByte=fis.read();
				if(readByte==-1) {
					break;
				}
				
				//읽은 바이트 출력하기
				fos.write(readByte);
				fos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos !=null) fos.close();
				if(fis !=null) fis.close();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}

	}
}
