package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// �̺�Ʈ ó��
public class SwingEventTest4 extends JFrame 
{
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel();
	
	SwingEventTest4()
	{
		setTitle("���콺 ��ǥ ��� ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ���α׷� ���� �ݱ� ��ư
		
		Panel.setLayout(null);
		Label.setLocation(50, 50);
		Label.setSize(170, 50);
		Label.setText("Ŭ�� ��ǥ : ");
		
		Panel.add(Label); // �⺻ Border layout ����
		Panel.addMouseListener(new MyMouse());
		
		this.add(Panel);
	}
	
	// ���콺 ����� ��� ��
	public class MyMouse extends MouseAdapter 
	{
		public void mouseClicked(MouseEvent e) 
		{  
			Integer x = e.getX();
			Integer y = e.getY();
			String str = "Ŭ�� ��ǥ : " + x.toString() + ", " + y.toString();
			Label.setText(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingEventTest4 MainFrame = new SwingEventTest4();
	}

}
