package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// �̺�Ʈ ó��
public class SwingEventTest2 extends JFrame {

	SwingEventTest2()
	{
		setTitle("swing ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ���α׷� ���� �ݱ� ��ư
		
		this.setLayout(new FlowLayout());
		JButton button1 = new JButton("Play");
		
		// 2) �͸� Ŭ������ ó��
		button1.addActionListener(new ActionListener() 
		{
			// ActionListener �������̽� �޼ҵ� ������
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
