package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �̺�Ʈ ó��
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
		setTitle("Ű �Է� ����");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ���α׷� ���� �ݱ� ��ư
		
		Panel.setLayout(null);
		Label1.setLocation(20, 20);
		Label1.setSize(120, 15);
		Label1.setText("���� Ű : ");

		Label2.setLocation(20, 50);
		Label2.setSize(120, 15);
		Label2.setText("��� Ű : ");

		Panel.add(Label1); // �⺻ Border layout ����
		Panel.add(Label2); // �⺻ Border layout ����
		Panel.addKeyListener(new MyKeyListener());
		
		this.add(Panel);
		Panel.requestFocus(true);
	}
	
	// Ű ����� ��� ��
	public class MyKeyListener extends KeyAdapter 
	{
		public void keyPressed(KeyEvent e) 
		{
			char cKey = e.getKeyChar();
			
			if(cKey == KeyEvent.CHAR_UNDEFINED)
			{ // ��� Ű
				String str = "��� Ű : " + KeyEvent.getKeyText(e.getKeyCode());
				Label2.setText(str);
			}
			else
			{
				String str = "���� Ű : " + cKey;
				Label1.setText(str);
			}
		}
	}

	public static void main(String[] args) {
		mainFrame = new SwingEventTest5();
	}

}
