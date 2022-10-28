package test.mypac;

import java.util.Scanner;

public class TvRemocon implements Remocon {

	public void up() {
		Scanner scan=new Scanner(System.in);
		System.out.println("몇 채널 올리시겠습니까? ");
		scan.nextInt();
	}

	public void down() {
		Scanner scan=new Scanner(System.in);
		System.out.println("몇 채널 내리시겠습니까? ");
		scan.nextInt();
	}

}
