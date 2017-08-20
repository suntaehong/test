package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// �̺�Ʈ ó��
public class SwingEventTest3 extends JFrame 
{
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel();
	
	SwingEventTest3()
	{
		setTitle("���콺 ��ǥ ��� ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ���α׷� ���� �ݱ� ��ư
		
		Panel.add(Label); // �⺻ Border layout ����
		Panel.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				Integer x = e.getX();
				Integer y = e.getY();
				String str = "X : " + x.toString() + " Y : " + y.toString();
				Label.setText(str);
			}
		});
		
		this.add(Panel);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingEventTest3 MainFrame = new SwingEventTest3();
	}

}
