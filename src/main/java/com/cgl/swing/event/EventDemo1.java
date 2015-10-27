package com.cgl.swing.event;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo1 implements ActionListener, WindowListener{

	public EventDemo1() {
		JFrame f = new JFrame("EventDemo1");
		Container contentPane = f.getContentPane();
		JButton b = new JButton("按我有声音");
		b.addActionListener(this);
		contentPane.add(b);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new EventDemo1();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
