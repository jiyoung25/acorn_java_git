package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//인터페이스도 dataType의 역할이 가능하다.
		Remocon r1=null;	
		
		//Remocon r2=new Remocon();//인터페이스 단독으로 객체 생성 불가(생성자가 없기 때문에)
		
		Remocon r2=new MyRemocon();
		r2.up();
		r2.down();
		
		//인터페이스의 참조(static final)
		String result=Remocon.Company;
		String result2=Remocon.Company2;//static final을 빼도 된다는 것을 알 수 있다.(in Remocon Class)
	}
}
