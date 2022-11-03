package test.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

//파일에 기록된 문자열을 가져와서 console에 출력해보기

public class MainClass12 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn202210/myFolder/memo.txt");
		
		try {
			FileReader fr=new FileReader(memoFile);
			OutputStreamWriter osw=new OutputStreamWriter(System.out);
			BufferedWriter bfw=new BufferedWriter(osw);
			int num=fr.toString().length();
			for(int i=0;i<num;i++ ) {
				bfw.write(fr.read());
				bfw.write(fr.read());
				bfw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
