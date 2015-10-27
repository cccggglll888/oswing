package com.cgl.swing.mode.jbutton;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MnemenieButton implements ActionListener {
	
	public MnemenieButton() {
		JFrame f = new JFrame("MnemenieButton");
		Container contentPane = f .getContentPane();
		
		JButton b = new JButton("Open new window");
		b.setMnemonic('O');
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
		JFrame newf = new JFrame("新窗口");
		JLabel label = new JLabel("这是新窗口");
		label.setHorizontalAlignment(JLabel.CENTER);
		newf.getContentPane().add(label);
		newf.setSize(100, 100);
		newf.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MnemenieButton();
	}
	
}
