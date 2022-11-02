package test.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MakeFrame extends JFrame implements ActionListener{
	JButton ebtn;
	static Integer a;
	
	public void actionPerformed(ActionEvent e) {
		a = JOptionPane.showConfirmDialog(ebtn, "배고파?");
		if(a==0) {
			System.out.println("밥 먹으러 가자");
		} else {
			System.out.println("커피 마시자");
		}
	}
	
	public MakeFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ebtn=new JButton("이벤트 버튼");
		ebtn.setSize(100, 100);
		ebtn.setBackground(getForeground().yellow);
		add(ebtn);
		ebtn.addActionListener(this);
		
		
		
	}
	public static void main(String[] args) {
		new MakeFrame("갸");
	}

}
