package com.cgl.swing.mode.jcombobox;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox2 {
	String[] s = {"美国", "日本", "中国", "英国", "德国", "意大利", "韩国"};
	
	public JComboBox2() {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		
		ComboBoxModel<String> mode = new UserDefineComboBoxModel();
		JComboBox<String> combo = new JComboBox<String>(mode);
		combo.setBorder(BorderFactory.createTitledBorder("你最喜欢到那个国家玩呢？"));
		
		contentPane.add(combo);
		
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
		new JComboBox2();
	}
	
	class UserDefineComboBoxModel extends AbstractListModel<String> implements ComboBoxModel<String> {
		private static final long serialVersionUID = 1L;
		
		String item = null;
		
		@Override
		public String getElementAt(int index) {
			return s[index++];
		}
		
		@Override
		public int getSize() {
			return s.length;
		}
		
		@Override
		public void setSelectedItem(Object anItem) {
			item = (String) anItem;
		}
		
		@Override
		public Object getSelectedItem() {
			return item;
		}
		
	}
}
