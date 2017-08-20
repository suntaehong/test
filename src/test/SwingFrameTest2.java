package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// 프레임 생성
// JFrame을 상속하여 프레임을 생성하는 예
public class SwingFrameTest2 extends JFrame {

	SwingFrameTest2()
	{
		setTitle("swing 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 프로그램 종료 닫기 버튼
		
		/*  
		 * 1) 버튼을 컨텍트 팬을 통해 추가하는 코드
		 */
//		Container ContentPane = getContentPane();
//		ContentPane.setLayout(null);
//		JButton button = new JButton("test");
//		button.setSize(70, 20);
//		button.setLocation(50, 10);
//		ContentPane.add(button);
		
		/*
		 * 2) JFrame을 통해 버튼을 추가하는 코드 - JDK 1.5 부터
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
