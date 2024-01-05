package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(610, 100, 370, 680);
//		frame.setSize(430, 932);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
//		frame.setUndecorated(true);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rhkdd\\Desktop\\[231120~]빅데이터 분석&추천시스템 개발자 양성과정 (직업훈련 교육)\\과제\\[240102~_프로젝트_01_Java Swing Project]Motive Donut App\\본 작업\\사진\\배경화면\\공통 배경.png"));
			lblNewLabel.setBounds(0, 0, 356, 643);
		}
		return lblNewLabel;
	}
}	//  End
