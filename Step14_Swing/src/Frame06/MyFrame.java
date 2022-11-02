package Frame06;


import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Interface Type
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JButton sendBtn;
	JButton delBtn;
	
	//생성자
	public MyFrame(String title) {
		super(title); //frame의 제목을 정해준다.
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		sendBtn=new JButton("전송");
		add(sendBtn);
		sendBtn.addActionListener(this);
		
		delBtn=new JButton("삭제");
		add(delBtn);
		delBtn.addActionListener(this);

		
	}
	
	public static void main(String[] args) {
		MyFrame my=new MyFrame("나의 프레임6");
		my.setVisible(true);
	}
	
	/*
	 * 전송버튼, 삭제버튼을 누르면 호출되는 메소드
	 * 메소드 안에서 어떤 버튼을 눌렀는지 확인해서 분기해야 한다.
	 * 메소드에 선언된 매개변수 ActionEvent e에 눌러진 버튼에 대한 정보가 담겨있다.
	 * 해당 객체를 활용해서 분기하면 된다.
	 */
	
	public void actionPerformed(ActionEvent e) {
		
		//눌러진 버튼의 참조값 얻어내기
		Object which = e.getSource();
		
		if(which == sendBtn) {
			JOptionPane.showMessageDialog(this, "오다 주웠다.");
		} else if(which == delBtn) {
			JOptionPane.showMessageDialog(this, "집 좀 치워라.");
		}
		
		//e.getActionCommand()
		//e.getSource() : 액션이 일어난 UI의 참조값을 얻을 수 있다.
		//e.getID()
		System.out.println(e.getID());
		System.out.println(e.getActionCommand());


	}
}
