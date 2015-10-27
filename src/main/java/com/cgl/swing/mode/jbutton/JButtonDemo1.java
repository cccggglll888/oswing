package com.cgl.swing.mode.jbutton;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JButtonDemo1");
		Container contentPane = f.getContentPane();
		
		//JButton b = new JButton("按我", new ImageIcon(ClassLoader.getSystemResource("imgs.jpg")));
		///////////////////////
		JButton b = new JButton();
		b.setIcon(new ImageIcon(ClassLoader.getSystemResource("imgs.jpg")));
		b.setText("按我");
		
		b.setHorizontalTextPosition(JButton.CENTER);
		b.setVerticalTextPosition(JButton.BOTTOM);
		
		contentPane.add(b);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
