package test.main;
import test.mypac.Machine;
import test.mypac.Part;
import test.mypac.Power;
import test.mypac.Electric;
public class MachineReal {
	
	public static void main(String[] args) {
		Machine m1=new Machine(new Electric(),new Part(),new Power());
	}
}
