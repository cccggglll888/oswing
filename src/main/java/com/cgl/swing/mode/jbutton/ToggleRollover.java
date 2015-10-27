package com.cgl.swing.mode.jbutton;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleRollover {
	public static void main(String[] args) {
		JFrame f = new JFrame("ToggleRollover");
		Container contenrPane = f.getContentPane();
		
		JToggleButton b = new JToggleButton();
		b.setRolloverEnabled(true);
		b.setIcon(new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
		b.setRolloverSelectedIcon(new ImageIcon(ClassLoader.getSystemResource("img2.jpg")));
		b.setSelectedIcon(new ImageIcon(ClassLoader.getSystemResource("imgs.jpg")));
		
		b.setDisabledSelectedIcon(new ImageIcon(ClassLoader.getSystemResource("gif.gif")));
//		b.setEnabled(false);
		
		contenrPane.add(b);
		
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
