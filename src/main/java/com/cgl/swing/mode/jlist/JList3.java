package com.cgl.swing.mode.jlist;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

public class JList3 {
	public JList3() {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		ListModel<String> mode = new DataModel();
		JList<String> list = new JList<>(mode);
		
		list.setVisibleRowCount(5);
		list.setBorder(BorderFactory.createTitledBorder("你最喜欢到那个国家玩呢？"));
		
		contentPane.add(new JScrollPane(list));
		
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
		new JList3();
	}
}

class DataModel extends AbstractListModel<String> {
	private static final long serialVersionUID = 1L;
	
	String[] s = {"美国", "日本", "中国", "英国", "德国", "意大利", "澳洲", "韩国"};
	
	@Override
	public String getElementAt(int index) {
		return (index+1) + "." + s[index++];
	}
	
	@Override
	public int getSize() {
		return s.length;
	}
	
}