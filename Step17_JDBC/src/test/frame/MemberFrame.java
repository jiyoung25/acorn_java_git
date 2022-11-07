package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener {
	// 필드
	JTextField inputName, inputAddr;
	DefaultTableModel model;
    JTable table;

	// 생성자
	public MemberFrame() {
		//레이아웃 매니저 설정
		setLayout(new BorderLayout());
	      
	    JLabel label1=new JLabel("이름");
	    inputName=new JTextField(10);
	      
	    JLabel label2=new JLabel("주소");
	    inputAddr=new JTextField(10);
	      
	    JButton saveBtn=new JButton("저장");
	    saveBtn.setActionCommand("save");
	    
	    JButton deleteBtn=new JButton("삭제");
	    deleteBtn.setActionCommand("delete");
	    
	    
	    //패널에 UI배치
	    JPanel panel=new JPanel();
	    panel.add(label1);
	    panel.add(inputName);
	    panel.add(label2);
	    panel.add(inputAddr);
	    panel.add(saveBtn);
	    panel.add(deleteBtn);
	    
	    
	    //패널째로 프레임 북쪽에 배치
		add(panel, BorderLayout.NORTH);

		// 표 형식으로 정보를 출력하기 위한 JTable
		table = new JTable();
		// 칼럼명을 String[]에 순서대로 준비
		String[] colNames = { "번호", "이름", "주소" };
		// 테이블에 연결할 모델객체(테이블에 출력할 데이터를 가지고 있는 객체
		model = new DefaultTableModel(colNames, 0);
		// 모델을 테이블에 연결한다.
		table.setModel(model);
		// 스크롤이 가능하도록 테이블을 JScrollPane에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		// 버튼에 리스너 등록
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
	    table.addPropertyChangeListener(this);
	    
	    displayMember();
	}

	// 테이블에 회원 목록을 출력하는 메소드
	public void displayMember() {
		/*//sample데이터
		Object[] row1= {1,"김구라","노량진"};
		Object[] row2= {2,"해골","행신동"};
		Object[] row3= {3,"원숭이","동물원"};
		//sample데이터를 DefaultTableModel객체에 추가하기
		model.addRow(row1);
		model.addRow(row2);
		model.addRow(row3);
		*/
		
		//MemberDao객체의 .getList()메소드가 리턴해주는 데이터를 활용해서 회원목록을 출력해보세요.
		
		/*
		MemberDto dto=null;
		MemberDao dao=new MemberDao();
		int len = dao.getList().size();
		Object[] row=new Object[3];
		for(int i=0; i<len; i++) {
			dto=new MemberDto();
			dto.setNum(dao.getList().get(i).getNum());
			dto.setName(dao.getList().get(i).getName());
			dto.setAddr(dao.getList().get(i).getAddr());
			row[0]=dto.getNum();
			row[1]=dto.getName();
			row[2]=dto.getAddr();
			model.addRow(row);
		}
		*/


		model.setRowCount(0); //테이블에 출력된 데이터가 reset된다.
		
		List<MemberDto> list=new MemberDao().getList();
		list.get(0).getNum();
		for(MemberDto tmp:list) {
			Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}

		
	}

	// main method
	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if (command.equals("save")) {
			MemberDto dto = new MemberDto();
			MemberDao dao = new MemberDao();
			dto.setName(inputName.getText());
			dto.setAddr(inputAddr.getText());
			boolean isSuccess = dao.insert(dto);
			JOptionPane.showMessageDialog(this, isSuccess ? "성공했습니다." : "실패했습니다.");
			displayMember();
		} else if(command.equals("delete")) {
			/*
			//1. JTable의 선택된 row의 인덱스를 읽어와서
			int rowNum=table.getSelectedRow();
			//2. DefaultTableModel에서 해당 인덱스의 table row에서 삭제할 회원의 번호를 읽어와서
			int dto_num=(int)table.getModel().getValueAt(rowNum, 0);
			//3. MemberDao객체를 이용해서 DB에서 삭제하고
			MemberDao dao=new MemberDao();
			dao.delete(dto_num);
			//4. 새로고침하기
			displayMember();
			*/
			//1. JTable의 선택된 row의 인덱스를 읽어와서
			int rowIndex=table.getSelectedRow();
			if(rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요");
				return;
			}
			//2. DefaultTableModel에서 해당 인덱스의 table row에서 삭제할 회원의 번호를 읽어와서
			int num=(int)model.getValueAt(rowIndex, 0);
			//3. MemberDao객체를 이용해서 DB에서 삭제하고
			new MemberDao().delete(num);
			//4. 새로고침하기
			displayMember();
		}
		
	}
	
	//table에 특정 이벤트가 발생했을 때, 호출되는 메소드
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change");
		System.out.println("property name: "+evt.getPropertyName());
		System.out.println("isEditing: "+table.isEditing());
		
		int rowIndex=0;
		int columnIndex=0;
		int row_num=0;
		String row_name=null;
		String row_addr=null;
		
		MemberDto dto=new MemberDto();
		MemberDao dao=new MemberDao();
		
		
		
		if(table.isEditing()==true) {
			
			rowIndex=table.getSelectedRow();
			columnIndex=table.getSelectedColumn();
			
			row_num=(int)model.getValueAt(rowIndex, 0);
			row_name=(String)model.getValueAt(rowIndex, 1);
			row_addr=(String)model.getValueAt(rowIndex, 2);
			
			dto.setNum(row_num);
			dto.setName(row_name);
			dto.setAddr(row_addr);
			
			dao.update(dto);
		}
		if(table.isEditing()==false) {
			model.fireTableCellUpdated(rowIndex, columnIndex);
			
			dto.setNum(row_num);
			dto.setName(row_name);
			dto.setAddr(row_addr);
			
			dao.update(dto);
		
		}
	}
}
