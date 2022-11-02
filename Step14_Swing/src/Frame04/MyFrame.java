package Frame04;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title); //frame의 제목을 정해준다.
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//경계선을 따라 배치하는 레이아웃
		setLayout(new BorderLayout());
		
		JButton btn1=new JButton("버튼1");
		add(btn1, BorderLayout.NORTH); // button 1을 북쪽에 추가하겠도다!
		JButton btn2=new JButton("버튼2");
		add(btn2, BorderLayout.SOUTH); // button 2을 북쪽에 추가하겠도다!
		JButton btn3=new JButton("버튼3");
		add(btn3, BorderLayout.EAST); // button 3을 북쪽에 추가하겠도다!
		JButton btn4=new JButton("버튼4");
		add(btn4, BorderLayout.WEST); // button 4을 북쪽에 추가하겠도다!
		JButton btn5=new JButton("버튼5");
		add(btn5, BorderLayout.CENTER); // button 5을 북쪽에 추가하겠도다!
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임4");
	}
}
