package test.mypac;
//앞의 Car.java와 비교해보자!!!!!
public class MyUtil {
	
	//static 필드
	public static String version;
	
	//static method
	public static void send() {
		System.out.println("version "+version+"을 전송합니다.");
		//static에선 this가 필요없다. (Car.java와 비교)
		//why? this는 객체 안에서 참조값을 가리킬 때 필요한 것!
	}
	

}
