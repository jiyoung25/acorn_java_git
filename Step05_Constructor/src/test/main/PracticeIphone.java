package test.main;
import test.mypac.PracticeIphonePac;
import test.mypac.Cpu;
import test.mypac.Memory;
import test.mypac.HardDisk;

public class PracticeIphone {
	public static void main(String[] args) {
		int num=1;
		String name="고양이";
		
		Cpu cpu=new Cpu();
		Memory memory=new Memory();
		HardDisk hardDisk=new HardDisk();
		
		PracticeIphonePac p1=new PracticeIphonePac(cpu, memory, hardDisk);
		p1.doCall(num, name);
		
		
	}
	
}
