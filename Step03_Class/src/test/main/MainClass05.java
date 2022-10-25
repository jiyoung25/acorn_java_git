package test.main;
import test.mypac.Rect;
public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * test.pack패키지에 Rect라는 이름의 클래스를 만들고자한다.
		 * 해당 클래스로 객체를 생성하고
		 * 사각형의 폭(width), 높이(height)를 필드에 대입하고
		 * showArea()를 호출하면 사각형의 넓이가 콘솔창에 출력될 수 있도록
		 * Rect클래스를 설계해보세요.
		 * 
		 */
		Rect r1=new Rect();
		r1.width=10;
		r1.height=5;
		r1.showArea();
		
		Rect r2=new Rect();
		r2.width=10;
		r2.height=10;
		r2.showArea();
	}

}
