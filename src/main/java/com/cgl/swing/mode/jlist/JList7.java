package com.cgl.swing.mode.jlist;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JList7 implements  ListSelectionListener {

	JList<String> list = null;
	JLabel label = null;
	String[] s = {"美国", "日本", "中国", "英国", "德国", "意大利", "澳洲", "韩国"};
	
	public JList7() {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		label = new JLabel("你选取的是：");
		
		list = new JList<String>(s);
		list.setVisibleRowCount(5);
		list.setBorder(BorderFactory.createTitledBorder("你最喜欢到那个国家玩呢？"));
		list.addListSelectionListener(this);
		
		contentPane.add(label, BorderLayout.NORTH);
		contentPane.add(new JScrollPane(list), BorderLayout.CENTER);
		
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
		new JList7();
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int tmp = 0;
		String stmp = "你选取的是：";
		int[] index = list.getSelectedIndices();
		for (int i = 0; i < index.length; i++) {
			tmp = index[i];
			stmp = stmp + s[tmp] + " ";
		}
		label.setText(stmp);
		
	}
	
}
