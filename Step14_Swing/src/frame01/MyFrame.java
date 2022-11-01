package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//생성자
	public MyFrame(String title) {
		super(title); //창의 이름이 정해짐
		//프레임의 초기 설정 작업하기
		this.setBounds(100/*x좌표*/, 100/*y좌표*/, 500/*폭*/, 500/*높이*/);
		//x버튼(close버튼)을 눌렀을 때 프로세스도 같이 종료되도록 설정
		//이 설정이 없다면 x버튼을 눌렀을 때 화면엔 없지만 프로세스는 돌아가는 상황 발생
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저는 아직 사용하지 않겠도다! (모든 UI를 절대 좌표에 배치하겠도다)
		this.setLayout(null);
		
		//버튼을 하나 만들어서
		JButton btn1=new JButton("버튼1");
		//위치를 설정하고
		btn1.setLocation(10,10);
		//크기도 설정해서
		btn1.setSize(100,30);
		//프레임에 추가하기
		this.add(btn1);
		
		
		//프레임을 화면상에 실제로 보이게 하기(false하면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	
	//run했을 때 실행의 흐름이 시작되는 특별한 method
	public static void main(String[] args) {
		//MyFrame 객체 생성하기
		new MyFrame("나의 프레임");
	}
}
