package frame03;

//CountThread 객체를 사용해 스레드 적용시켜보기 (카운트다운)

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountThread;

public class MyFrame extends JFrame implements ActionListener{
   
   //생성자
   public MyFrame(String title) {
      super(title);
      //프레임의 초기 설정 작업하기 
      setBounds(100, 100, 500, 500);
      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //레이아웃 설정
      setLayout(new FlowLayout());
      
      JButton startBtn=new JButton("카운트 다운 시작");
      startBtn.addActionListener(this);
      //프레임에 버튼 추가
      add(startBtn);
      
      JTextField tf=new JTextField(10);
      //프레임에 JTextField 추가
      add(tf);
      
      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
      setVisible(true);
   }
   
   //run 했을때 실행의 흐름이 시작되는 특별한 메소드 
   public static void main(String[] args) {
      //MyFrame 객체 생성하기
      new MyFrame("나의 프레임");
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println("새로운 스래드를 시작 합니다.");
      /*
       * start()메소드를 호출하면 새로운 스레드가 시작된다. (우리가 만든 메소드명 아님. 무조건 어느것이든 start()임.)
       * 새로운 스레드(작업단위)는 위에서 생성한 스레드 객체의 run()메소드가 자동으로 호출되면서 시작된다.
       * run()메소드의 리턴여부와 상관없이 start()메소드는 바로 리턴된ㄷ.
       * start()메소드를 호출한 스레드는 main 스레드이기 때문에 main스레드는 또 다른 작업을 할 수 있다.
       */
      new CountThread().start();
      // run()(제작한 메소드의 이름)이 아닌, start()인 것 기억하기. Thread문법임.
   }
   
}




