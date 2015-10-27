package com.cgl.swing.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo {
	public BoxLayoutDemo() {
		JFrame f = new JFrame();
		
		Container contentPane = f.getContentPane();
		
		Box baseBox = Box.createHorizontalBox();
		contentPane.add(baseBox);
		
		Box vBox = Box.createVerticalBox();
		JButton b = new JButton("first");
		vBox.add(b);
		b = new JButton("third");
		b.setMaximumSize(new Dimension(100, 150));
		vBox.add(b);
		baseBox.add(vBox);
		
		Box vBox1 = Box.createVerticalBox();
		baseBox.add(vBox1);
		b = new JButton("second");
		b.setAlignmentX(Component.CENTER_ALIGNMENT);
		b.setMaximumSize(new Dimension(300, 50));
		vBox1.add(b);
		
		Box hBox = Box.createHorizontalBox();
		vBox1.add(hBox);
		
		Box vBox2 = Box.createVerticalBox();
		vBox2.add(Box.createVerticalStrut(50));
		vBox2.add(new JButton("fourth"));
		vBox2.add(Box.createVerticalStrut(50));
		hBox.add(vBox2);
		
		Box vBox3 = Box.createVerticalBox();
		vBox3.add(Box.createVerticalGlue());
		vBox3.add(new JButton("This is the last button"));
		hBox.add(vBox3);
		
		f.setTitle("BoxLayout");
		f.pack();
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new BoxLayoutDemo();
	}
}
