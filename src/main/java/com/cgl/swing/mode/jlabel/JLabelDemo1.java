package com.cgl.swing.mode.jlabel;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JLabelDemo1");
		Container contentPane = f.getContentPane();
		
//		JLabel label = new JLabel();
//		label.setText("Hello");
//		label.setHorizontalAlignment(JLabel.RIGHT);
//		label.setVerticalAlignment(JLabel.TOP);
		////////////////////////////////
		JLabel label = new JLabel("Hello", JLabel.RIGHT);
		label.setVerticalAlignment(JLabel.TOP);
		
		
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
