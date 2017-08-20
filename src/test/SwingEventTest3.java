package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// 이벤트 처리
public class SwingEventTest3 extends JFrame 
{
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel();
	
	SwingEventTest3()
	{
		setTitle("마우스 좌표 출력 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 프로그램 종료 닫기 버튼
		
		Panel.add(Label); // 기본 Border layout 적용
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
