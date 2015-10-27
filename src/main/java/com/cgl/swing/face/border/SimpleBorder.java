package com.cgl.swing.face.border;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleBorder {
	public static void main(String[] args) {
		JFrame f = new JFrame("SimpleBorder");
		Container content = f.getContentPane();
		JButton b = new JButton();
		b.setBorder(BorderFactory.createLineBorder(Color.BLUE, 10));
		content.add(b);
		f.setSize(200, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
