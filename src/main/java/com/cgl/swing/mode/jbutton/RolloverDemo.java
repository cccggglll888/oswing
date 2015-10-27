package com.cgl.swing.mode.jbutton;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RolloverDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame("RolloverDemo");
		Container contentPane = f.getContentPane();
		
		Icon rollover = new ImageIcon(ClassLoader.getSystemResource("img1.jpg"));
		Icon general = new ImageIcon(ClassLoader.getSystemResource("img2.jpg"));
		Icon press = new ImageIcon(ClassLoader.getSystemResource("imgs.jpg"));
		
		JButton b = new JButton();
		
		b.setRolloverEnabled(true);
		
		b.setIcon(general);
		b.setRolloverIcon(rollover);
		b.setPressedIcon(press);
		
		// 不可用状态下的按钮
		// b.setEnabled(false);
		// b.setDisabledIcon(press);
		
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
