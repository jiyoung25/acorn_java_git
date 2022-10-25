package test.main;

import test.mypac.Water;

public class WaterMake {
	public static void main(String[] args) {
		Water w1 = new Water();
		w1.num=1;
		w1.name="웅진 코웨이";
		w1.waterIn();
		w1.waterOut();
		
		Water w2 = new Water();
		w2.num=2;
		w2.name="삼성 정수기";
		w2.waterIn();
		w2.waterOut();
	}

}
