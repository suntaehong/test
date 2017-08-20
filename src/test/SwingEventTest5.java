package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 이벤트 처리
public class SwingEventTest5 extends JFrame 
{
	/**
	 * test
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel Panel = new JPanel();
	JLabel Label1 = new JLabel();
	JLabel Label2 = new JLabel();

	@SuppressWarnings("unused")
	private static SwingEventTest5 mainFrame;
	
	SwingEventTest5()
	{
		setTitle("키 입력 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 프로그램 종료 닫기 버튼
		
		Panel.setLayout(null);
		Label1.setLocation(20, 20);
		Label1.setSize(120, 15);
		Label1.setText("문자 키 : ");

		Label2.setLocation(20, 50);
		Label2.setSize(120, 15);
		Label2.setText("기능 키 : ");

		Panel.add(Label1); // 기본 Border layout 적용
		Panel.add(Label2); // 기본 Border layout 적용
		Panel.addKeyListener(new MyKeyListener());
		
		this.add(Panel);
		Panel.requestFocus(true);
	}
	
	// 키 어댑터 사용 예
	public class MyKeyListener extends KeyAdapter 
	{
		public void keyPressed(KeyEvent e) 
		{
			char cKey = e.getKeyChar();
			
			if(cKey == KeyEvent.CHAR_UNDEFINED)
			{ // 기능 키
				String str = "기능 키 : " + KeyEvent.getKeyText(e.getKeyCode());
				Label2.setText(str);
			}
			else
			{
				String str = "문자 키 : " + cKey;
				Label1.setText(str);
			}
		}
	}

	public static void main(String[] args) {
		mainFrame = new SwingEventTest5();
	}

}
