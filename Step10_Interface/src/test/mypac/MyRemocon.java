package test.mypac;

//interface는 extends하는 것이 아닌 implements(구현)하는 것이다.
public class MyRemocon implements Remocon{

	public void up() {
		System.out.println("채널을 올려요");
	}
	
	public void down() {
		System.out.println("채널을 내려요");
	}

}
