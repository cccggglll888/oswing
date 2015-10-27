package com.cgl.swing.mode.jbutton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DefaultButton {
	public DefaultButton() {
		JFrame f = new JFrame("DefaultButton");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		
		JButton b1 = new JButton("Open Text window");
		JButton b2 = new JButton("Open Image window");
		b1.setMnemonic('T');
		b2.setMnemonic('I');
		f.getRootPane().setDefaultButton(b1);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame newf = new JFrame("新窗口");
				JLabel label = new JLabel("这是文字窗口");
				label.setHorizontalAlignment(JLabel.CENTER);
				newf.getContentPane().add(label);
				newf.setSize(200, 200);
				newf.setVisible(true);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame newf = new JFrame("新窗口");
				JLabel label = new JLabel(new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
				label.setHorizontalAlignment(JLabel.CENTER);
				newf.getContentPane().add(label);
				newf.setSize(200, 200);
				newf.setVisible(true);
				
			}
		});
		
		contentPane.add(b1);
		contentPane.add(b2);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new DefaultButton();
	}
}
