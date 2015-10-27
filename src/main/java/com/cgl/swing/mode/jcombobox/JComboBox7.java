package com.cgl.swing.mode.jcombobox;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox7 {
	String[] fontsize = {"12", "14", "16", "18", "20", "22", "24", "26", "28"};
	String defaultMessage = "请选择或直接输入文字大小！";
	
	public JComboBox7() {
		JFrame f = new JFrame("JComboBox");
		Container contentPane = f.getContentPane();
		
		JComboBox<String> combo = new JComboBox<String>(fontsize);
		combo.setBorder(BorderFactory.createTitledBorder("请选择你要的文字大小"));
		combo.setEditable(true);
		ComboBoxEditor editor = combo.getEditor();
		combo.configureEditor(editor, defaultMessage);
		
		
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
		new JComboBox7();
	}
	
}
