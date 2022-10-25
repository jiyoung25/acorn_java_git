package test.mypac;
/*
 * Class의 역할
 * 
 * 1. 객체의 설계도 역할
 * 
 * 2. data type의 역할
 * 
 * 3. static field와 method를 포함하는 역할
 * 
 */
public class Car {
	//저장소(field)
	public String name;
	public String whose;
	
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.whose+"의 "+this.name+"이(가) 달려요!^0^");
		//this: 자기자신(이 클래스)으로 만든 ★객체★의 참조값
	}
	
	//멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요!!x-x");
	}
	
	public void curve() {
		System.out.println(this.whose+"의 "+ this.name+"(이)가 회전해요.");
	}
	
}