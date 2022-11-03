package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class review_20221103 extends JFrame implements ActionListener{
	
	//생성자
	public review_20221103(String title) {
		super(title);
		this.setBounds(100/*x좌표*/, 100/*y좌표*/, 500/*폭*/, 500/*높이*/);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setLayout(new FlowLayout());
		
		JButton countBtn=new JButton("작업시작");
		countBtn.setLocation(10,10);
		countBtn.setSize(100,30);
		this.add(countBtn);
		countBtn.addActionListener(this);
		
		JTextField tf=new JTextField();
		//프레임에 JTextField 추가
		add(tf);
		
		
		//프레임을 화면상에 실제로 보이게 하기(false하면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	
	//run했을 때 실행의 흐름이 시작되는 특별한 method
	public static void main(String[] args) {
		//MyFrame 객체 생성하기
		new review_20221103("나의 프레임");
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("카운트 다운을 시작합니다.");
		new Thread() {
			public void run() {
				int count=10;
				while(true) {
					if(count < 0) {
						break;
					} else {
						try {
							System.out.println("카운트 다운: "+count);
							Thread.sleep(1000);
							count--;
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		}.start();
		
	}
}
