package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// 이벤트 처리
public class SwingEventTest2 extends JFrame {

	SwingEventTest2()
	{
		setTitle("swing 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 프로그램 종료 닫기 버튼
		
		this.setLayout(new FlowLayout());
		JButton button1 = new JButton("Play");
		
		// 2) 익명 클래스로 처리
		button1.addActionListener(new ActionListener() 
		{
			// ActionListener 인터페이스 메소드 재정의
			public void actionPerformed(ActionEvent e) {
				JButton Button = (JButton)e.getSource();
				if(Button.getText().equals("Play"))
					Button.setText("Stop");
				else
					Button.setText("Play");
			}
		});
		this.add(button1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingEventTest2 MainFrame2 = new SwingEventTest2();
	}

}
