package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass11 {
	public static void main(String[] args) {
		// 문자열을 저장할 파일을 만들기 위한 File객체
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");

		try {
			// 만일 파일이 존재하지 않으면
			if (!memoFile.exists()) {
				// 파일을 만들고
				memoFile.createNewFile();
			}
			// FileWriter: 파일에 문자열을 넣는 것을 도와주는 객체
			FileWriter pw = new FileWriter(memoFile,true);
			pw.write("신기한 객체 FileWriter");
			pw.write("\r\n");
			pw.write("\t"); //  \t는 tab이다.
			pw.write("열심히 java를 배우는 중");
			pw.write("\r\n");
			pw.write("저녁 머먹지");
			pw.flush();
			pw.close();
			pw.close();
			System.out.println("파일에 문자를 저장했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
