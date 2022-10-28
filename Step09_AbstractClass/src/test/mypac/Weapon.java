package test.mypac;

//클래스를 만들 때도, "이 클래스에는 실제 구현이 되지 않은 메소드가 있습니다." 알려주기(abstract)
public abstract class Weapon {
	
	//무기 작동 준비
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	
	//공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지 않기.
	//미완성된 추상 메소드를 만들 때는 abstract예약어가 필요하다.
	public abstract void attack(); //메소드의 모양만 정의.(접근지정자, 리턴타입, 메소드 이름, 메소드 인자)
	                      //실제 구현을 안함
}
