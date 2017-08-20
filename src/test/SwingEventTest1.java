package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// 이벤트 처리
public class SwingEventTest1 extends JFrame {

	SwingEventTest1()
	{
		setTitle("swing 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 프로그램 종료 닫기 버튼
		
		this.setLayout(new FlowLayout());
		JButton button1 = new JButton("Play");
		
		// 내부 클래스로
		button1.addActionListener(new MyActionListner());
		this.add(button1);
	}
	
	// 1) 내부 클래스로 처리
	public class MyActionListner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton Button = (JButton)e.getSource();
			if(Button.getText().equals("Play"))
				Button.setText("Stop");
			else
				Button.setText("Play");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingEventTest1 MainFrame2 = new SwingEventTest1();
	}

}
