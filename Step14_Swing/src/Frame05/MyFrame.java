package Frame05;


import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Interface Type
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title); //frame의 제목을 정해준다.
		
		//this 예약어를 이용해서 MyFrame 객체의 다형성 확인!!~~~ ^0^
		MyFrame a = this;
		JFrame b = this;
		Frame c =this;
		Component d = this;
		Object e= this;
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		add(sendBtn);	
		//anonymous inner class생성
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송 버튼을 눌렀네?");
				
				//알림창이 뜬다!
				JOptionPane.showMessageDialog(a/*MyFrame.this*/, "전송합니다");
				//JOptionPane.showMessageDialog(어따 띄울래?, 알림 메시지는 뭘루 할래?);
			}
		};
		sendBtn.addActionListener(listener);
		
		/*
		 * 삭제버튼도 프레임에 배치하고 해당 버튼을 눌렀을 때 "삭제 버튼을 눌렀네?"라는
		 * 메시지를 콘솔창에 출력되도록 프로그래밍 해보세요.
		 */
		JButton delBtn=new JButton("삭제");
		add(delBtn);
		//addActionListener은 메소드가 하나이므로 람다형식으로도 사용할 수 있다.
		delBtn.addActionListener(msg->JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다."));
		
		/* delBtn.addActionListener(new ActionListener() {
		* 	public void actionPerformed(ActionEvent e) {
		* 		System.out.println("삭제 버튼을 눌렀네?");
		* 		
		* 		JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다.");
		* 	}
		* 	
		* });
		*/
		
	}
	public static void main(String[] args) {
		MyFrame my=new MyFrame("나의 프레임5");
		my.setVisible(true);
		
	}
}
