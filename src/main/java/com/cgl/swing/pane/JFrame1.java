package com.cgl.swing.pane;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame1 implements ActionListener{

	public JFrame1() {
		JFrame f = new JFrame("JFrameDemo");
		Container contentPane = f.getContentPane();
		JButton b = new JButton("Click me to get new Window");
		b.addActionListener(this);
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame newf = new JFrame();
		newf.setSize(200, 200);
		newf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrame1();
	}
}
