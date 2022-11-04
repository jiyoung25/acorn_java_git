package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * 1. JTextField에 문자열을 입력하고 추가 버튼을 누르면
 * 입력한 문자열이 myFolder/memo.txt파일에 append되도록 해보세요.
 * 
 * 2. 불러오기 버튼을 누르면 myFolder/memo.txt파일에 있는 모든 문자열을
 * JTextArea에 출력하도록 해보세요.
 */

public class Quiz3 extends JFrame implements ActionListener {
	

	JButton addBtn, callBtn;
	JTextField text;
	String nameAdd, nameCall;
	
	public Quiz3(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setLayout(new FlowLayout());
		
		text =new JTextField(10);
		add(text);
		
		addBtn=new JButton("추가");
		this.add(addBtn);
		nameAdd=addBtn.getName();
		addBtn.addActionListener(this);
		
		callBtn=new JButton("불러오기");
		this.add(callBtn);
		nameCall=callBtn.getName();
		callBtn.addActionListener(this);

		
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		JFrame frame=new Quiz3("퀴즈");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		File file= new File("c:/acorn202210/myFolder/memo.txt");
		
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		
		Object gs=e.getSource();
		String jt=text.getText();
		
		try {

			fw=new FileWriter(file,true);
			fr=new FileReader(file);
			br=new BufferedReader(fr);

			if(gs.equals(addBtn)) {
				fw.write(jt);
				fw.flush();
				fw.close();
			} else if(gs.equals(callBtn)) {
				String line=br.readLine();
				long num=line.lines().count();
				while(true) {
					if(line==null) {
						break;
					} else {
						System.out.println(line);
					}
				}
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
