package com.cgl.swing.mode.jcombobox;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class JComboBox5 {
	String[] s = {"西瓜", "苹果", "草莓", "香蕉", "葡萄"};
	ImageIcon[] icons = new ImageIcon[5];
	
	public JComboBox5() {
		JFrame f = new JFrame("JComboBox");
		Container contentPane = f.getContentPane();
		
		ItemObj[] obj = new ItemObj[5];
		
		for (int i = 0; i < obj.length; i++) {
			icons[i] = new ImageIcon(ClassLoader.getSystemResource((i+1)+".jpg"));
			obj[i] = new ItemObj(s[i], icons[i]);
		}
		
		// 传入对象（集合Vector，数组[]，模型ComboBoxModel）
		JComboBox<ItemObj> combo = new JComboBox<ItemObj>(obj);
		combo.setBorder(BorderFactory.createTitledBorder("你喜欢吃哪些水果？"));
		// 渲染模式
		combo.setRenderer(new ACellRenderer());
		combo.setMaximumRowCount(3);
		
		
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
		new JComboBox5();
	}
	
	class ItemObj{
		String name;
		ImageIcon icon;
		
		public ItemObj(String name, ImageIcon icon) {
			this.name = name;
			this.icon = icon;
		}
	}
	
	class ACellRenderer extends JLabel implements ListCellRenderer<ItemObj> {
		private static final long serialVersionUID = 1L;

		public ACellRenderer() {
			setOpaque(true);
		}
		
		@Override
		public Component getListCellRendererComponent(JList<? extends ItemObj> list, ItemObj value, int index,
				boolean isSelected, boolean cellHasFocus) {
			if (value != null) {
				
				setText(value.name);
				setIcon(value.icon);
				
			}
			if (isSelected) {
				setBackground(list.getSelectionBackground());
				setForeground(list.getSelectionForeground());
				setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			} else {
				setBackground(list.getBackground());
				setForeground(list.getForeground());
				setBorder(null);
			}
			return this;
		}
		
	}
}
