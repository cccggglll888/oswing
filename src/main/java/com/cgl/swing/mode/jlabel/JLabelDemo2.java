package com.cgl.swing.mode.jlabel;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JLabelDemo2");
		Container contentPane = f.getContentPane();
		
		Icon icon = new ImageIcon(ClassLoader.getSystemResource("imgs.jpg"));
		JLabel label = new JLabel("Hello", icon, JLabel.CENTER);
		
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);

		label.setIconTextGap(10);
		
		contentPane.add(label);
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
