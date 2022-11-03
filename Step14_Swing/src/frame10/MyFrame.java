package frame10;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.Thread.UncaughtExceptionHandler;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements UncaughtExceptionHandler {
	// 생성자
	public MyFrame(String title) {
		super(title); // frame의 제목을 정해준다.
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.CENTER));

		JTextField inputMsg = new JTextField(10);
		JLabel label = new JLabel("레이블..."); // 글자 출력 UI

		add(inputMsg);
		add(label);

		// 키보드를 눌렀을 때 호출될 메소드를 가지고 있는 KeyListener interface type 객체

		KeyListener listener = new KeyListener() {
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed()");
				//키보드 누름
			}

			public void keyTyped(KeyEvent e) {
				//입력 주우우웅
				System.out.println("keyTyped()");

			}

			public void keyReleased(KeyEvent e) {
				//키보드에서 뗐을 때
				System.out.println("keyReleased()");
				//눌러진 키의 코드값 읽어오기
				int code = e.getKeyCode();
				System.out.println("code: "+code);
				//만일 엔터를 눌렀다면
				if(code == KeyEvent.VK_ENTER) { //OR    code == 10;
					//입력된 문자를 가져와서
					String msg = inputMsg.getText();
					//읽어주세욧 ^-^
					label.setText(msg);
				}
			}

		};

		inputMsg.addKeyListener(listener);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame("나의 프레임10");
	}


	public void uncaughtException(Thread t, Throwable e) {
		
	}
}
