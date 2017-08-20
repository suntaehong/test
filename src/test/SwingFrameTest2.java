package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// ������ ����
// JFrame�� ����Ͽ� �������� �����ϴ� ��
public class SwingFrameTest2 extends JFrame {

	SwingFrameTest2()
	{
		setTitle("swing ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ���α׷� ���� �ݱ� ��ư
		
		/*  
		 * 1) ��ư�� ����Ʈ ���� ���� �߰��ϴ� �ڵ�
		 */
//		Container ContentPane = getContentPane();
//		ContentPane.setLayout(null);
//		JButton button = new JButton("test");
//		button.setSize(70, 20);
//		button.setLocation(50, 10);
//		ContentPane.add(button);
		
		/*
		 * 2) JFrame�� ���� ��ư�� �߰��ϴ� �ڵ� - JDK 1.5 ����
		 */
		this.setLayout(null);
		JButton button = new JButton("test"); 
		button.setSize(70, 20);
		button.setLocation(50, 10);
		this.add(button);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingFrameTest2 MainFrame2 = new SwingFrameTest2();
	}

}
