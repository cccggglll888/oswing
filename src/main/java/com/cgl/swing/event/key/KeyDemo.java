package com.cgl.swing.event.key;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyDemo extends KeyAdapter implements ActionListener {
	
	JFrame f = null;
	JLabel label = null;
	JTextField tField = null;
	String keyString = "";
	
	public KeyDemo() {
		f = new JFrame("KsyEventDemo");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(3, 1));
		label = new JLabel();
		tField = new JTextField();
		tField.requestFocus();
		tField.addKeyListener(this);
		JButton b = new JButton("清除");
		b.addActionListener(this);
		contentPane.add(label);
		contentPane.add(tField);
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
		keyString = "";
		label.setText("");
		tField.setText("");
		tField.requestFocus();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//
		//e.getKeyCode();//在此方法中不适用
		//e.getKeyModifiersText(0);//在此方法中不适用
		//e.getKeyModifiersText(e.getModifiers());//返回修饰建字符串，如shift或者ctrl+shift
		
		char c = e.getKeyChar();
		if (c == 'o') {
			JFrame newF = new JFrame("新窗口");
			newF.setSize(200, 200);
			newF.setVisible(true);
		}
		keyString = keyString + c;
		label.setText(keyString);
	}
	
	public static void main(String[] args) {
		new KeyDemo();
	}
}
