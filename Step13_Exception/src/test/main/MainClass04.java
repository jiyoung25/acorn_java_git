package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		// 파일 클래스. 실제로 내 C드라이브에 있는 파일에 대해 삭제하고 더하고 등등 작업할 수 있다.
		// 실제 존재하지 않아도 만들 수 있고, 존재하는 것은 수정할 수 있다.

		/*
		 * 1. 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어할 수 있는 File 객체를 생성해서 참조값을 f라는 지역변수에 담기(그리고
		 * memo.txt는 현재 존재하지 않는다.)
		 */
		File f = new File("c:/acorn202210/myFolder/memo.txt");

		// 2. 실제 memo.txt파일이 존재하지 않으면 파일을 만들고
		// 존재하면 memo.txt파일을 삭제하도록 프로그래밍을 해보세요.
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (f.exists()) {
			f.delete();
		}
		/*
		 * 이렇게도 됨
		 *	try {
		 *		if (!f.exists()){
		 *			f.createNewFile();
		 *		} else if(f.exists()) {
		 *		f.delete();
		 *	} catch (IOException e) {
		 * 		e.printStackTrace();
		 * 	  }
		 * 
		 * 
		 */

	}
}
