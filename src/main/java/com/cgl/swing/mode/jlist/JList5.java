package com.cgl.swing.mode.jlist;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

public class JList5 {
	public JList5() {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		ListModel<String> mode = new DateModel2(1);
		JList<String> list1 = new JList<String>(mode);
		list1.setVisibleRowCount(5);
		list1.setBorder(BorderFactory.createTitledBorder("您玩过哪些软件？"));
		
		mode = new DateModel2(2);
		JList<String> list2 = new JList<String>(mode);
		list2.setBorder(BorderFactory.createTitledBorder("您玩过哪些数据库？"));
		
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
	
	public static void main(String[] args) {
		new JList5();
	}
}

class DateModel2 extends AbstractListModel<String> {
	private static final long serialVersionUID = 1L;
	
	String[] s = {"MS SQL", "MySQL", "IBM DB2", "ORACLE", "Windows 2000", "Linux", "UNix", "OS2"};
	int flag;
	
	public DateModel2(int flag) {
		this.flag = flag;
	}
	
	@Override
	public String getElementAt(int index) {
		String tmp = null;
		if (flag == 1) {
			tmp = (index+1) + "." + s[index++];
		}
		if (flag == 2) {
			if (index < 4) {
				tmp = (index + 1) + "." + s[index++];
			}
		}
		
		return tmp;
	}
	
	@Override
	public int getSize() {
		if (flag == 1) {
			return s.length;
		}
		if (flag == 2) {
			return s.length - 4;
		}
		return s.length;
	}
	
}