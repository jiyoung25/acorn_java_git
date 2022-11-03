package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1=new File("c:/acorn202210/myFolder/folder1");
		//폴더 만들기
		f1.mkdir(); //파일만들기는 f1.createNewFile
		
		for(int i=0; i<1000; i++) {
			File tmp=new File("c:/acorn202210/myFolder/folder"+i);
			tmp.mkdir();
			tmp.delete(); //파일객체로 삭제하면 복구가 불가능하므로 신중히 할 것.
		}
		
	}
}
