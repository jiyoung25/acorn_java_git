package test.main;

import test.mypac.SmartPhone;

public class MainClass05 {

	
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		//생성자는 Phone->HandPhone->SmartPhone순으로 호출됨.
		
		
		p1.call(); //Phone의 기능
		p1.mobileCall();//HandPhone의 기능
		p1.takePicture();//HandPhone의 기능
		p1.doInternet();//SmartPhone의 기능
	}
}
