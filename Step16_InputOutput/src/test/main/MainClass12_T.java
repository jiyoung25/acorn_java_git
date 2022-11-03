package test.main;

import java.io.File;
import java.io.FileReader;

//선생님 풀이

public class MainClass12_T {
	public static void main(String[] args) {

		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");

		try {
			FileReader fr = new FileReader(memoFile);
			while (true) {
				// 한글자씩 읽어들인다.
				int code = fr.read();
				// 만일 더이상 읽을 문자가 없으면
				if (code == -1) {
					break;// 반복문 탈출
				}
				char ch = (char) code;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
