package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202210/visual_work/html/images/juck1.png");
			fos=new FileOutputStream("c:/acorn202210/myFolder/juck1_copy.png");
			
			
			while(true) {
				int byte_num= fis.read();
				if(byte_num==-1) break;
				fos.write(byte_num);
				fos.flush();
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
