package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// �̺�Ʈ ó��
public class SwingEventTest1 extends JFrame {

	SwingEventTest1()
	{
		setTitle("swing ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ���α׷� ���� �ݱ� ��ư
		
		this.setLayout(new FlowLayout());
		JButton button1 = new JButton("Play");
		
		// ���� Ŭ������
		button1.addActionListener(new MyActionListner());
		this.add(button1);
	}
	
	// 1) ���� Ŭ������ ó��
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
