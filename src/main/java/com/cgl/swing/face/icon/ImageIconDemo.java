package com.cgl.swing.face.icon;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIconDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame("ImageIconDemo");
		Container contentPane = f.getContentPane();
		Icon icon = new ImageIcon(ClassLoader.getSystemResource("gif.gif"));
		JLabel label = new JLabel(icon, JLabel.CENTER);
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
