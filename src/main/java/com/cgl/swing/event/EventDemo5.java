package com.cgl.swing.event;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo5 extends WindowAdapter implements ActionListener{
	
	JButton b1 = null;
	JButton b2 = null;
	
	public EventDemo5() {
		JFrame f = new JFrame("EventDemo5");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		b1 = new JButton("按我有声音");
		b2 = new JButton("按我有窗口");
		b1.addActionListener(this);
		b2.addActionListener(this);
		contentPane.add(b1);
		contentPane.add(b2);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			Toolkit.getDefaultToolkit().beep();
		}
		if (e.getSource() == b2) {
			JFrame newF = new JFrame("新窗口");
			newF.setSize(200, 200);
			newF.setVisible(true);
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new EventDemo5();
	}
	
}
