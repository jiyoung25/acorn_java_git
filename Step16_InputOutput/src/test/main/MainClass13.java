package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//선생님 풀이 + 왜안돼?

public class MainClass13 {
	public static void main(String[] args) {

		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");

		try {
			FileReader fr = new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			while(true) {
				//개행기호를 기준으로 한줄씩 읽어오기 때문에 개행기호는 읽어오지 않는다.
				if(br.readLine()==null) {
					break;
				}
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
