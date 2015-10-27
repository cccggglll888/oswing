package com.cgl.swing.layout;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutDemo {
	public NullLayoutDemo() {
		JFrame f = new JFrame();
		
		Container contentPane = f.getContentPane();
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("first");
		JButton b2 = new JButton("second");
		
		contentPane.add(b1);
		contentPane.add(b2);
		
		b1.setBounds(15, 10, 80, 30);
		b2.setBounds(80, 50, 90, 40);
		
		f.setTitle("NoLayout");
		f.setSize(200, 130);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new NullLayoutDemo();
	}
}
