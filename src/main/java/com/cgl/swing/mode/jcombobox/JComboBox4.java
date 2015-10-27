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

public class JComboBox4 {
	String[] s = {"1", "2", "3", "4", "5"};
	
	public JComboBox4() {
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		
		JComboBox<String> combo = new JComboBox<String>(s);
		combo.setBorder(BorderFactory.createTitledBorder("你喜欢吃哪些水果？"));
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
		new JComboBox4();
	}
	
	class ACellRenderer extends JLabel implements ListCellRenderer<String> {
		private static final long serialVersionUID = 1L;

		public ACellRenderer() {
			setOpaque(true);
		}
		
		@Override
		public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
				boolean isSelected, boolean cellHasFocus) {
			if (value != null) {
				
				setText(value.toString());
				setIcon(new ImageIcon(ClassLoader.getSystemResource(value+".jpg")));
				
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
