package com.cgl.swing.event;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo2 extends WindowAdapter implements ActionListener{
	public EventDemo2() {
		JFrame f = new JFrame("EventDemo2");
		Container contentPane = f.getContentPane();
		JButton b = new JButton("按我有声音");
		b.addActionListener(this);
		contentPane.add(b);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(this);
	}

	public static void main(String[] args) {
		new EventDemo2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
