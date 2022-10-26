package test.main;

import java.util.Scanner;

import test.mypac.Bike;

public class review_20221026 {
	public static void main(String[] args) {
		int[] nums= {10, 20, 30, 40, 50};
		int[] cloned=nums.clone();
		int[] copied=nums;
		copied[0]=2000;
		cloned[0]=200;
		
		System.out.println(nums[0]);
		System.out.println(copied[0]);
		System.out.println(cloned[0]);
		
		
		String[] names=new String[3];
		names[0]="김친구";
		names[1]="이친구";
		names[2]="박친구";
		
		for(String tmp:names) {
		System.out.println(tmp);
		};
		
		
		Bike[] bikes=new Bike[3];
		for(int i=0; i<bikes.length; i++) {
			bikes[i]=new Bike();
		}
		
		for(Bike tmp:bikes) {
		tmp.ride();
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("문자를 입력해 주세요. : ");
		String str=scanner.nextLine();
		System.out.println(str);
		
		//1. 문자열을 저장할 수 있는 방 5개짜리 배열객체를 생성해서 참조값을 msgs라는 지역변수에 담는다.
		String[] msgs=new String[5];
		
		//2.키보드로부터 입력받을 수 있는 Scanner객체를 생성해서 참조값을 scan이라는 지역변수에 담는다.
		Scanner scan=new Scanner(System.in);
		
		//3. 반복문을 위에서 생성한 배열의 방의 개수만큼 돌면서 키보드로부터 문자열을 입력받아서 배열에 순서대로 저장한다.
		for(String tmp:msgs) {
			
			System.out.print("msgs를 순서대로 5번 적어주세요.: ");
			String line=scan.nextLine();
			tmp=line;
		}
		
		
		//4. 반복문을 돌면서 배열에 저장되었던 모든 문자열을 순서대로 콘솔창을 출력한다.
		for(String tmp:msgs) {
			System.out.println("결과는 "+tmp);
		}

		
		
	}

}
