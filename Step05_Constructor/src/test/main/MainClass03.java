package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;
//import 필수~ %^^

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  1. MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아보세요.
		 *   단, MacBook클래스를 수정하지 마세요.
		 */
		

		Cpu cpu =new Cpu();
		Memory memory =new Memory();
		HardDisk hardDisk=new HardDisk();
		//지역변수에 null을 넣고 싶다면, HardDisk hardDisk=null;이렇게 하면 됨~ 굳이 new안써도 됨
		MacBook mac1=new MacBook(cpu, memory, hardDisk);
		//지역변수에 담지 않고 바로 버릴 것을 만들고 싶다면
		//MacBook mac1=new MacBook(new Cpu();, new Memory();, new HardDisk(););
		//만약 null로 담고 싶다면 MacBook mac1= new MacBook(null, null, null);
		
		
		//2. mac1지역변수에 들어있는 참조값을 이용해서 .doGame()이라는 메소드를 호출해보세요.
		mac1.doGame();
		
	}

}
