package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f1=new File("c:/acorn202210/myFolder/gura.txt");
		try {
			if(!f1.exists()) {
				f1.createNewFile();
				System.out.println("gura.txt파일을 만들었습니다.");
			} else {
				f1.delete();
				System.out.println("gura.txt파일을 삭제했습니다.");
			}
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
