package test.main;

import java.awt.BorderLayout;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 *  1. JTextField에 문자열을 입력하고 추가 버튼을 누르면
 *  입력한 문자열이 myFolder/memo.txt파일에 append 되도록 해보세요.
 * 
 *  2. 불러오기 버튼을 누르면 myFolder/memo.txt 파일에 있는 모든 문자열을
 *  JTextArea에 출력하도록 해보세요.
 */

//QuizMain 좀 더 수정해서 다듬기

public class QuizMain2 extends JFrame implements ActionListener {
	JTextField inputMsg;
	JTextArea ta;

	public QuizMain2(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		inputMsg = new JTextField(10);
		ta = new JTextArea();
		JButton addBtn = new JButton("추가");
		JButton callBtn = new JButton("불러오기");

		// JPanel객체를 생성해서
		JPanel panel = new JPanel();
		// UI를 패널에 추가하고
		panel.add(inputMsg);
		panel.add(addBtn);
		panel.add(callBtn);

		// 패널을 프레임의 상담에 배치하기
		add(panel, BorderLayout.NORTH);

		// 스크롤이 가능한 UI (ta를 감싸고 있다.) 모든 UI는 component type이므로 ta를 인자로 전달 가능
		JScrollPane scroll = new JScrollPane(ta);

		// JTextArea를 감싸고 있는 scroll 패널을 프레임의 중심에 배치하기
		add(scroll, BorderLayout.CENTER);

		addBtn.addActionListener(this);
		callBtn.addActionListener(this);

		ta.setEditable(false); // 수정불가 그러므로 읽기 전용
		setVisible(true);
	}

	public static void main(String[] args) {
		new QuizMain2("QuizMain");
	}

	// ActionListener interface를 구현했기 때문에 재정의한 메소드
	@Override
	public void actionPerformed(ActionEvent e) {

		// 어떤 버튼을 눌렀는지 알아내서
		String command = e.getActionCommand();
		// 분기한다.
		if (command.equals("추가")) {
			saveToFile();
		} else if (command.equals("불러오기")) {
			loadFromFile();
		}
	}

	// 파일에 문자열을 추가하는 메소드
	private void saveToFile() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/acorn202210/myFolder/memo.txt", true);
			fw.write(inputMsg.getText());
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 파일로부터 문자열을 읽어오는 메소드
	private void loadFromFile() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("c:/acorn202210/myFolder/memo.txt");
			br = new BufferedReader(fr);

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				ta.append(line + "\r\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
