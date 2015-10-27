package com.cgl.swing.layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutTest {
	public BoxLayoutTest() {
		JFrame f = new JFrame();
		
		Container contentPane = f.getContentPane();
		
		Box baseBox = Box.createHorizontalBox();
		contentPane.add(baseBox);
		
		baseBox.add(new JButton("A"));
		// 插入中间空格
//		baseBox.add(Box.createHorizontalGlue());
		
		// 插入带距离空格
//		baseBox.add(Box.createHorizontalStrut(50));
		
		// 插入带水平垂直的空格
//		baseBox.add(Box.createRigidArea(new Dimension(50, 50)));
		
		//插入带指定最大，最佳，最小空格
		baseBox.add(new Box.Filler(new Dimension(50, 50), new Dimension(100, 50), new Dimension(200, 50)));
		
		baseBox.add(new JButton("B"));
		
		f.setTitle("BoxLayout");
		f.pack();
		//f.setSize(new Dimension(200, 60));
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new BoxLayoutTest();
	}
}
