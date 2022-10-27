package test.mypac;

public class SmartPhone extends HandPhone {

	public SmartPhone() {
		System.out.println("SmartPhone기본생성자가 호출됨");
	}

	// 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		super.takePicture(); //super은 부모객체라는 뜻~~~~꺄오~~~
		System.out.println("1000만 화소의 사진을 찍어요^0^");
	}
	//super가 있으면 부모객체의 해당 메소드가 뜬다.
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("화상통화를 걸어요~");
	}
	//super을 없애면 부모 메소드 없이 고친 메소드만 사용할 수 있다.
	
	//MainClass5를 run해보면 알 수 있다.
}
