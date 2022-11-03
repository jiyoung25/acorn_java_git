package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.MakeThread;

public class LabThread extends JFrame implements ActionListener{
	
	//생성자
	public LabThread(String title) {
		super(title);
		this.setBounds(100/*x좌표*/, 100/*y좌표*/, 500/*폭*/, 500/*높이*/);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setLayout(new FlowLayout());
		
		JButton startBtn=new JButton("작업시작");
		startBtn.setLocation(10,10);
		startBtn.setSize(100,30);
		this.add(startBtn);
		startBtn.addActionListener(this);
		
		JTextField tf=new JTextField();
		//프레임에 JTextField 추가
		add(tf);
		
		
		//프레임을 화면상에 실제로 보이게 하기(false하면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	
	//run했을 때 실행의 흐름이 시작되는 특별한 method
	public static void main(String[] args) {
		//MyFrame 객체 생성하기
		new LabThread("나의 프레임");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("작업을 시작합니다.");
		Thread mt=new MakeThread();
	}
}
