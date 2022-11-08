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
		model = new DefaultTableModel(colNames, 0) { //Anonymous Inner class
			public boolean isCellEditable(int row, int column) {//override
				if(column==0) {
					return false;
				} else {
					return true;
				}
			}
		};
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
		
		
		
		// ArrayList를 사용하지 않고도 가능. 그러나 dao.getList()할 때마다 oracle에 접속해야돼서 번거롭다. (List에 넣어두면 계속 Oracle DB에 접속하지 않아도 된다.)
		/*MemberDao dao=new MemberDao();
		int len = dao.getList().size();
		Object[] row=new Object[3];
		for(int i=0; i<len; i++) {
			MemberDto dto=new MemberDto();
			dto.setNum(dao.getList().get(i).getNum());
			dto.setName(dao.getList().get(i).getName());
			dto.setAddr(dao.getList().get(i).getAddr());
			row[0]=dto.getNum();
			row[1]=dto.getName();
			row[2]=dto.getAddr();
			model.addRow(row);
		}*/
		


		model.setRowCount(0); //테이블에 출력된 데이터가 reset된다.
		
		List<MemberDto> list=new MemberDao().getList();
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
			 *  //1. JTable의 선택된 row의 인덱스를 읽어와서 int rowNum=table.getSelectedRow();
			 *  //2.DefaultTableModel에서 해당 인덱스의 table row에서 삭제할 회원의 번호를 읽어와서
			 *  int dto_num=(int)table.getModel().getValueAt(rowNum, 0);
			 *  //3. MemberDao객체를 이용해서 DB에서 삭제하고 MemberDao dao=new MemberDao();
			 *  dao.delete(dto_num);
			 *  //4. 새로고침하기
			 *  displayMember();
			 */
			// 1. JTable의 선택된 row의 인덱스를 읽어와서
			int rowIndex = table.getSelectedRow();
			if (rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요");
				return;
			}
			int confirm_num = JOptionPane.showConfirmDialog(this, "선택된 row를 삭제하시겠습니까?");
			// 만일 예를 눌렀다면
			if (confirm_num == JOptionPane.YES_NO_OPTION) {
				// 2. DefaultTableModel에서 해당 인덱스의 table row에서 삭제할 회원의 번호를 읽어와서
				int num = (int) model.getValueAt(rowIndex, 0);
				// 3. MemberDao객체를 이용해서 DB에서 삭제하고
				new MemberDao().delete(num);
				// 4. 새로고침하기
				displayMember();
			}
		}

	}

	// table에 특정 이벤트가 발생했을 때, 호출되는 메소드
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change");
		System.out.println("property name: " + evt.getPropertyName());
		System.out.println("isEditing: " + table.isEditing());

		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();

		int rowIndex = table.getSelectedRow();
		int columnIndex = table.getSelectedColumn();
		int row_num = 0;
		String row_name = null;
		String row_addr = null;
		//try {
			if (table.isEditing() == false && !evt.getPropertyName().equals("ancestor")) {

				row_num = (int) model.getValueAt(rowIndex, 0);
				row_name = (String) model.getValueAt(rowIndex, 1);
				row_addr = (String) model.getValueAt(rowIndex, 2);

				dto.setNum(row_num);
				dto.setName(row_name);
				dto.setAddr(row_addr);

				dao.update(dto);
			}
	//	} catch (Exception e) {

	//	}
			/*
			 * 만일 테이블의 수정사항을 DB에  수정 반영할 적당한 시점이 되면
			 * if( evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()){
			 * 현재 선택된 row의 정보를 DB에 수정 반영 한다.
			 * 변화된 값을 읽어와서 DB에 반영한다.
			 * 수정된 칼럼에 있는 row의 전체 값을 읽어온다.
			 * int selectedIndex=table.getSelectedRow();
			 * int num=(int) model.getValueAt(selectedIndex, 0)
			 * String name=(String)model.getValueAt(selectedIndex,1)
			 * String addr=(String)model.getValueAt(selectedIndex,2)
			 * 수정할 회원의 정보를 MemberDto객체에 담고
			 * MemberDto dto=new MemberDto(num,name, addr);
			 * DB에 저장하기
			 * new MemberDao().update(dto);
			 * 선택된 row clear
			 * table.clearSelection();
			 * 
			 * 
			 * 
			 */

	}
}
