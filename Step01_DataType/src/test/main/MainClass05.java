package test.main;
/*
 * [Java 참조 data type]
 * 
 * String type
 * 
 * -문자열을 다룰 때 사용하는 data type이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		//"김구라"라는 String type 객체를 heap영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name="김구라";
		//name안에 있는 참조값을 tmp변수에 복사해주기.
		String tmp=name;
		//"원숭이"라는 String type 객체를 heap영역에 만들고 그 참조값을 name변수에 덮어쓰기
		name="원숭이";
		//name변수를 비우기(null은 참조 data type이 담길 수 있는 빈 공간을 의미한다.
		name=null;
		name="김구라"; //null이후 같은 값을 넣으면 아까와 같은 id값이 생성됨
		name="원숭이";
		name="김구라";
		/*
		 * 같은 파일 안에서는 같은 값("김구라")을 넣으면 id값이 동일하지만,
		 * 다른 파일의 "김구라"는 다른 id가 생성된다.
		 */
	}

}
