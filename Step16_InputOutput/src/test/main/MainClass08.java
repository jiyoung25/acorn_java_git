package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File f= new File("c:/");
		File[] files = f.listFiles();
		
		for(File tmp:files) {
			if(tmp.isDirectory()) {
				//디렉토리명 출력
				System.out.println("["+tmp.getName()+"]");
			} else {
				//파일이면 파일명만 출력
				System.out.println(tmp.getName());
			}
			System.out.println("-----------------\r\n"+tmp);
		}
		
	}
}
