package com.cgl.swing.mode.jcheckbox;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBox1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JcheckBox");
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
		p2.setBorder(BorderFactory.createTitledBorder("以下为JCheckBox的图形示范"));
		JCheckBox c4 = new JCheckBox("图形 1", new ImageIcon(ClassLoader.getSystemResource("imgs.jpg")));
		JCheckBox c5 = new JCheckBox("图形 2", new ImageIcon(ClassLoader.getSystemResource("imgs.jpg")));
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
}
