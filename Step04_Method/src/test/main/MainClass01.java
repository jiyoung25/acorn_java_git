package test.main;
import test.mypac.MyObject;
public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * MyObject  객체를 하나만 생성해서 그 객체가 가지고 있는 
		 * walk();, getNumber();, getGreeting(); 메소드를 차례대로 호출해 보세요.
		 * 단, 메소드가 어떤 data를 return하면 해당 데이터를 지역변수에 담으세요.
		 */
		MyObject obj1=new MyObject();
		obj1.walk();
		int number= obj1.getNumber();
		String greet = obj1.getGreeting();
	}

}
