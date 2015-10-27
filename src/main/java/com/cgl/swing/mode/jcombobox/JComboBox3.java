package com.cgl.swing.mode.jcombobox;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox3 {
	String[] s = {"美国", "日本", "中国", "英国", "德国", "意大利", "韩国"};
	
	public JComboBox3() {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		
		ComboBoxModel<String> mode = new AModel();
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
		new JComboBox3();
	}
	
	class AModel extends DefaultComboBoxModel<String> {
		private static final long serialVersionUID = 1L;

		public AModel() {
			for (int i = 0; i < s.length; i++) {
				addElement(s[i]);
			}
		}
	}
}
