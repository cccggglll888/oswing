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
import javax.swing.ListSelectionModel;

public class JList2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 3));
		String[] s1 = {"美国", "日本", "中国", "英国", "德国", "意大利", "澳洲", "韩国"};
		String[] s2 = {"路人甲", "路人乙", "路人丙", "路人丁"};
		Vector<String> v = new Vector<>();
		v.addElement("Nokia 8850");
		v.addElement("Nokia 8520");
		v.addElement("Motorola v8088");
		v.addElement("Motorola v3688x");
		v.addElement("Panasonic GD92");
		v.addElement("其他");
		
		//SINGLE_SELECTION//单选
		//SINGLE_INTERVAL_SELECTION//连续
		//MULTIPLE_INTERVAL_SELECTION//多重(默认)
		
		JList<String> list1 = new JList<String>(s1);
		list1.setBorder(BorderFactory.createTitledBorder("你最喜欢到那个国家玩呢？"));
		
		JList<String> list2 = new JList<String>(s2);
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list2.setBorder(BorderFactory.createTitledBorder("你最喜欢哪一个人呢？"));
		
		JList<String> list3	= new JList<String>(v);
		list3.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list3.setBorder(BorderFactory.createTitledBorder("你最喜欢哪一种手机呢？"));
		
		contentPane.add(new JScrollPane(list1));
		contentPane.add(new JScrollPane(list2));
		contentPane.add(new JScrollPane(list3));
		
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
