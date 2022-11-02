package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 *  JTextField 객체의 메소드를 잘 활용해서
 *  메시지를 입력하고 눌러보셈 버튼을 누르면
 *  입력한 메시지가 알림창에 출력되도록 프로그래밍 해보세요.
 */

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title); //frame의 제목을 정해준다.
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//문자열을 한 줄 입력할 수 있는 JTextField
		JTextField inputMsg=new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton delBtn = new JButton("삭제");
		
		add(inputMsg);
		add(sendBtn);
		add(delBtn);
	
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msg=inputMsg.getText();
				JOptionPane.showMessageDialog(MyFrame.this, msg);
				
			}
		};
		sendBtn.addActionListener(listener);
		delBtn.addActionListener(t->{
		String msg=inputMsg.getText();
		JOptionPane.showMessageDialog(MyFrame.this, msg);
		});
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임8");
	}
}
