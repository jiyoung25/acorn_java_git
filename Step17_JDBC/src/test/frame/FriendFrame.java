package test.frame;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.FriendDao;
import test.dto.FriendDto;

/*
 * 친구 정보를 저장할 테이블을 만들어보세요.
 * 친구 한 명의 정보는 번호, 이름, 전화번호, 생일입니다.
 * 
 * 테이블명: Friend
 * 
 * 번호(num) -> number
 * 이름(name) -> varchar2
 * 전화번호(phone)-> varchar2
 * 생일(birth) -> date
 * 
 * 친구의 번호를 얻어낼 sequence도 만들어 놓으세요.
 * 
 * 시퀀스명: friend_seq
 * 
 * 친구정보를 입력, 수정, 삭제, 목록보기를 할 수 있는 프레임 ui를 만들어보세요.
 * 
 * FriendFrame, FriendDto, FriendDao클래스를 만들면 됩니다.
 * 
 */

public class FriendFrame extends JFrame {
	JPanel panel;
	JButton insertBtn, deleteBtn;
	JTable table;
	DefaultTableModel model;
	JTextField text1,text2,text3;
	JLabel label1, label2, label3;
	static FriendDao dao;
	static FriendDto dto;
	
	
	public FriendFrame(){
		setBounds(100, 100, 1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(getForeground().PINK);

		
		panel= new JPanel();
		
		label1=new JLabel("이름");
		label2=new JLabel("전화번호");
		label3=new JLabel("생일");
		
		text1=new JTextField(10);
		text2=new JTextField(20);
		text3=new JTextField(20);
		
		insertBtn=new JButton("입력");
		deleteBtn=new JButton("삭제");

		
		insertBtn.setCursor(new Cursor(HAND_CURSOR));
		deleteBtn.setCursor(new Cursor(HAND_CURSOR));
		
		panel.setLayout(new FlowLayout());
		
		String[] column_name = {"num", "name", "phone", "birth"};
		
		table=new JTable();
		model=new DefaultTableModel(column_name,0);
		
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		
		panel.add(insertBtn);
		panel.add(deleteBtn);

		
		this.add(panel);
		this.add(panel);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FriendFrame();
		
		dto=new FriendDto();
		dao=new FriendDao();
		System.out.println(dao.getData(2).getPhone());
	}
}
