package test.main;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AmazingGUI extends JFrame {
	public AmazingGUI(String title) {
		super(title);
		this.setBounds(500, 100, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setCursor(WAIT_CURSOR);
		this.setBackground(getForeground().red);
		
		JButton btn= new JButton("꺄오 버튼");
		btn.setBackground(getForeground().blue);
		btn.setCursor(getCursor().getPredefinedCursor(MOVE_CURSOR));
		btn.setSize(500, 50);
		
		this.add(btn);
		this.setLayout(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new AmazingGUI("신기해");
	}
	
	
}
