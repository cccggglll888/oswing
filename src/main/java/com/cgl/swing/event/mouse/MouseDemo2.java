package com.cgl.swing.event.mouse;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDemo2 extends MouseAdapter{
	JFrame f = null;
	JButton b1 = null;
	JLabel label = null;
	
	public MouseDemo2() {
		f = new JFrame("MouseDemo2");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		b1 = new JButton("按钮");
		label = new JLabel("起始状态，还没鼠标事件", JLabel.CENTER);
		b1.addMouseListener(this);
		contentPane.add(label);
		contentPane.add(b1);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		label.setText("目前鼠标坐标（X,Y）为：（"+e.getX()+"，"+e.getY()+"）");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			JFrame newF = new JFrame("新窗口");
			newF.setSize(200, 200);
			newF.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MouseDemo2();
	}
}
