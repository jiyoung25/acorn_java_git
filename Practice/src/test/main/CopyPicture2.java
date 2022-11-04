package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:/acorn202210/visual_work/html/images/juck2.png");
			fos = new FileOutputStream("c:/acorn202210/myFolder/juck2_copy2.png");

			byte[] byte_num = fis.readAllBytes();
			for(int tmp:byte_num) {
				System.out.println(tmp);
				fos.write(tmp);
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