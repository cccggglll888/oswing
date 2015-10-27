package com.cgl.swing.mode.jbutton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButton {
	public static void main(String[] args) {
		JFrame f = new JFrame("ToggleButton");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(3, 1));
		
		JToggleButton b1 = new JToggleButton("Button 1");
		JToggleButton b2 = new JToggleButton("Button 2");
		JToggleButton b3 = new JToggleButton("Button 3");
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
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
