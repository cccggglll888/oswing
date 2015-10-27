package com.cgl.swing.mode.jradiobutton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButton2 implements ItemListener {

	JFrame f = null;
	JRadioButton r4 = null;
	JRadioButton r5 = null;
	
	public JRadioButton2() {
		f = new JFrame("JRadioButton2");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 3));
		p1.setBorder(BorderFactory.createTitledBorder("你最喜欢哪家快餐店？"));
		JRadioButton r1 = new JRadioButton("麦当劳");
		JRadioButton r2 = new JRadioButton("肯德基");
		JRadioButton r3 = new JRadioButton("德克士");
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		
		ButtonGroup bgroup1 = new ButtonGroup();
		bgroup1.add(r1);
		bgroup1.add(r2);
		bgroup1.add(r3);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 1));
		p2.setBorder(BorderFactory.createTitledBorder("你最喜欢哪种程序语言？"));
		r4 = new JRadioButton("JAVA", new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
		r5 = new JRadioButton("C++", new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
		r4.addItemListener(this);
		r5.addItemListener(this);
		p2.add(r4);
		p2.add(r5);
		
		ButtonGroup bgroup2 = new ButtonGroup();
		bgroup2.add(r4);
		bgroup2.add(r5);
		
		contentPane.add(p1);
		contentPane.add(p2);
		
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
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getSource() == r4) {
				r4.setIcon(new ImageIcon(ClassLoader.getSystemResource("img2.jpg")));
			}
			if (e.getSource() == r5) {
				r5.setIcon(new ImageIcon(ClassLoader.getSystemResource("img2.jpg")));
			}
		} else {
			if (e.getSource() == r4) {
				r4.setIcon(new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
			}
			if (e.getSource() == r5) {
				r5.setIcon(new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
			}
		}
		
	}
	
	public static void main(String[] args) {
		new JRadioButton2();
	}
}
