package test.main;

import test.mypac.TestDay;

public class TestDayPrint {
	public static void main(String[] args) {

		TestDay td1 = new TestDay();
		int rest_day = td1.d_day();
		System.out.println(rest_day);
		System.out.println(td1.Lucky());
		System.out.println(rest_day);

	}

}
