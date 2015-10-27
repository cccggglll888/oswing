package com.cgl.swing.mode.jlist;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JList1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		String[] s = {"美国", "日本", "中国", "英国", "德国"};
		Vector<String> v = new Vector<>();
		v.addElement("Nokia 8850");
		v.addElement("Nokia 8520");
		v.addElement("Motorola v8088");
		v.addElement("Motorola v3688x");
		v.addElement("Panasonic GD92");
		v.addElement("其他");
		
		JList<String> list1 = new JList<String>(s);
		list1.setBorder(BorderFactory.createTitledBorder("你最喜欢到那个国家玩呢？"));
		
		JList<String> list2	= new JList<String>(v);
		list2.setBorder(BorderFactory.createTitledBorder("你最喜欢哪一种手机呢？"));
		
//		contentPane.add(list1);
//		contentPane.add(list2);
		////////////////////////////
		contentPane.add(new JScrollPane(list1));
		contentPane.add(new JScrollPane(list2));
		
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
