package com.cgl.swing.layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutDemo {
	public BorderLayoutDemo() {
		JFrame f = new JFrame();
		Container contentPane = f.getContentPane();
		
		BorderLayout bl = new BorderLayout();
		bl.setHgap(0);
		bl.setVgap(0);
		
		contentPane.setLayout(bl);
		contentPane.add(new JButton("EAST"), BorderLayout.EAST);
		contentPane.add(new JButton("WEST"), BorderLayout.WEST);
		contentPane.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
		contentPane.add(new JLabel("CENTER", JLabel.CENTER), BorderLayout.CENTER);
		
		f.setTitle("BorderLayout");
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
		new BorderLayoutDemo();
	}
}
