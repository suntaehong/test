package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// 이벤트 처리
public class SwingEventTest4 extends JFrame 
{
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel();
	
	SwingEventTest4()
	{
		setTitle("마우스 좌표 출력 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 프로그램 종료 닫기 버튼
		
		Panel.setLayout(null);
		Label.setLocation(50, 50);
		Label.setSize(170, 50);
		Label.setText("클릭 좌표 : ");
		
		Panel.add(Label); // 기본 Border layout 적용
		Panel.addMouseListener(new MyMouse());
		
		this.add(Panel);
	}
	
	// 마우스 어댑터 사용 예
	public class MyMouse extends MouseAdapter 
	{
		public void mouseClicked(MouseEvent e) 
		{  
			Integer x = e.getX();
			Integer y = e.getY();
			String str = "클릭 좌표 : " + x.toString() + ", " + y.toString();
			Label.setText(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingEventTest4 MainFrame = new SwingEventTest4();
	}

}
