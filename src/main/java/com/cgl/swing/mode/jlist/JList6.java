package com.cgl.swing.mode.jlist;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

public class JList6 {
	public JList6() {
		String[] s = {"西瓜", "苹果", "草莓", "香蕉", "葡萄"};
		
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		
		JList<String> list1 = new JList<String>(s);
		list1.setBorder(BorderFactory.createTitledBorder("你喜欢吃哪些水果？"));
		list1.setCellRenderer(new CellRenderer());
		
		contentPane.add(new JScrollPane(list1));
		
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
		new JList6();
	}
	
	class CellRenderer extends JLabel implements ListCellRenderer<String> {
		private static final long serialVersionUID = 1L;

		public CellRenderer() {
			setOpaque(true);
		}
		
		@Override
		public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
				boolean isSelected, boolean cellHasFocus) {
			
			if (value != null) {
				setText(value.toString());
				setIcon(new ImageIcon(ClassLoader.getSystemResource((index+1)+".jpg")));
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
