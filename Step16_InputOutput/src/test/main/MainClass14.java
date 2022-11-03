package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   c:/acorn202210/myFolder/memo.txt 파일에 기록된 문자열을 읽어서 
 *   콘솔창에 출력해 보세요.
 *   
 *   - hint 
 *   FileReader 객체를 잘 활용해 보세요.
 */

public class MainClass14 {
	public static void main(String[] args) {
		// File 객체
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");

		// 파일에서 문자열을 읽어들일수 있는 객체 생성
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 반복문 돌면서
			while (true) {
				// 개행기호를 기준으로 한줄씩 읽어오기 때문에 개행기호는 읽어오지 않는다.
				// 미리 만들어둔 지역변수에 참조값 대입하기
				fr = new FileReader(memoFile);
				br = new BufferedReader(fr);
				String line = br.readLine();
				if (line == null) {
					break;
				}
				// 읽어낸 문자열 콘솔에 출력하기
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				 // 다 사용한 입출력객체는 close해주어 닫아주어야한다. 계속 켜져있으면 나중에 메모리 문제, 발열 등 문제가 생길 수 있다.
				//파일을 닫는 작업은 열린 순서의 역순으로.
				if(br!=null)br.close();
				if(br!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}