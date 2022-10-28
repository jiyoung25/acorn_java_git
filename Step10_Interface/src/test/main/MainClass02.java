package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.TvRemocon;
import test.mypac.TvRemocon2;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인

		MyRemocon r1=new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		TvRemocon r4=new TvRemocon();
		TvRemocon2 r5=new TvRemocon2();
		
		useRemocon(r1);
		useRemocon(r2);
		useRemocon(r4);
		useRemocon(r5);
		
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
