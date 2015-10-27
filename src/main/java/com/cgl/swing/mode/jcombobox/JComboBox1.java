package com.cgl.swing.mode.jcombobox;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		
		String[] s = {"美国", "日本", "中国", "英国", "德国", "意大利", "韩国"};
		
		Vector<String> v = new Vector<String>();
		v.addElement("Nokia 8850");
		v.addElement("Nokia 8520");
		v.addElement("Motorola v8088");
		v.addElement("Motorola v3688x");
		v.addElement("Panasonic GD92");
		v.addElement("其他");
		
		JComboBox<String> combo1 = new JComboBox<String>(s);
		combo1.addItem("澳洲");
		combo1.setBorder(BorderFactory.createTitledBorder("你最喜欢到那个国家玩呢？"));
		
		JComboBox<String> combo2 = new JComboBox<String>(v);
		combo2.setBorder(BorderFactory.createTitledBorder("你最喜欢哪一种手机呢？"));
		
		contentPane.add(combo1);
		contentPane.add(combo2);
		
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
