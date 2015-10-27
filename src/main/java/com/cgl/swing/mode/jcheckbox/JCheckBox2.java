package com.cgl.swing.mode.jcheckbox;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBox2 implements ItemListener {
	
	JFrame f = null;
	JCheckBox c4 = null;
	JCheckBox c5 = null;
	
	public JCheckBox2() {
		f = new JFrame("JCheckBox");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 3));
		p1.setBorder(BorderFactory.createTitledBorder("你最喜欢哪家快餐店？"));
		JCheckBox c1 = new JCheckBox("麦当劳");
		JCheckBox c2 = new JCheckBox("肯德基");
		JCheckBox c3 = new JCheckBox("德克士");
		p1.add(c1);
		p1.add(c2);
		p1.add(c3);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 1));
		p2.setBorder(BorderFactory.createTitledBorder("你最喜欢哪种程序语言？"));
		c4 = new JCheckBox("JAVA", new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
		c5 = new JCheckBox("C++", new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
		c4.addItemListener(this);
		c5.addItemListener(this);
		p2.add(c4);
		p2.add(c5);
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
//		e.getItem();//状态
		System.out.println("e.getItem()           === "+e.getItem());
//		e.paramString();//状态
		System.out.println("e.paramString()       === "+e.paramString());
//		e.getItemSelectable();//选中对象，相当于是getSource
		System.out.println("e.getItemSelectable() === "+e.getItemSelectable());
//		e.getStateChange();
		System.out.println("e.getStateChange()    === "+e.getStateChange());
		
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getSource() == c4) {
				c4.setIcon(new ImageIcon(ClassLoader.getSystemResource("img2.jpg")));
			}
			if (e.getSource() == c5) {
				c5.setIcon(new ImageIcon(ClassLoader.getSystemResource("img2.jpg")));
			}
		} else {
			if (e.getSource() == c4) {
				c4.setIcon(new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
			}
			if (e.getSource() == c5) {
				c5.setIcon(new ImageIcon(ClassLoader.getSystemResource("img1.jpg")));
			}
		}
		
	}
	
	public static void main(String[] args) {
		new JCheckBox2();
	}
}
