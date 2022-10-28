package test.mypac;

/*
 *  [interface]
 *  
 *  -생성자가 없다.(단독 객체 생성 불가)
 *  -구현된 메소드는 가질 수 없다.
 *  -추상 메소드는 가질 수 있다. (abstract 예약어를 사용하지 않아도 된다.)
 *  -필드는 static final 상수만 가질 수 있다.(static final을 생략해도 된다. 어차피 static final로 됨.)
 *  -data type의 역할을 할 수 있다.
 *  -interface type의 참조값이 필요하면 구현(implements)클래스를 만들어서 객체를 생성해야 한다.
 *  -클래스 상속은 단일상속이지만, interface는 다중구현이 가능하다.
 *  
 */


public interface Remocon {
	//public Remocon() {}; ==>> error. 인터페이스는 생성자가 없음!
	public void up(); //abstract 예약어를 사용하지 않아도 된다.
	//public static final int; ==> error. 상수가 아니다.
	public static final String Company="LG";
	public String Company2="Samsung";
	public void down();
	
}
