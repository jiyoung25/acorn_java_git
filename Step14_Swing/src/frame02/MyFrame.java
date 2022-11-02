package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title); //frame의 제목을 정해준다.
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1=new JButton("버튼1");
		add(btn1);
		JButton btn2=new JButton("버튼2");
		add(btn2);
		JButton btn3=new JButton("버튼3");
		add(btn3);
		JButton btn4=new JButton("버튼4");
		add(btn4);
		JButton btn5=new JButton("버튼5");
		add(btn5);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임2");
	}
}
