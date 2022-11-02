package Frame07;


import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Interface Type
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {
		super(title); //frame의 제목을 정해준다.
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton sendBtn;
		sendBtn=new JButton("전송");
		add(sendBtn);
		//버튼에 액션 커맨드 설정
		sendBtn.setActionCommand("send");
		//동작 설정
		sendBtn.addActionListener(this);
		
		JButton delBtn;
		delBtn=new JButton("삭제");
		add(delBtn);
		//버튼에 액션 커맨드 설정
		delBtn.setActionCommand("delete");
		//어케 동작할건지 설정
		delBtn.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		MyFrame my=new MyFrame("나의 프레임7");
		my.setVisible(true);
	}
	
	/*
	 * 전송버튼, 삭제버튼을 누르면 호출되는 메소드
	 * 메소드 안에서 어떤 버튼을 눌렀는지 확인해서 분기해야 한다.
	 * 메소드에 선언된 매개변수 ActionEvent e에 눌러진 버튼에 대한 정보가 담겨있다.
	 * 해당 객체를 활용해서 분기하면 된다.
	 */
	
	public void actionPerformed(ActionEvent e) {
		//버튼의 참조값을 활용하지 않고 사용하는 방법
		String command=e.getActionCommand();
		if(command.equals("send")){
			JOptionPane.showMessageDialog(this, "전송합니다.");
		} else {
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		}
	}
}
