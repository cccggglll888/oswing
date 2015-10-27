package com.cgl.swing.mode.jcombobox;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBox8 implements ItemListener, ActionListener {
	String[] fontsize = {"12", "14", "16", "18", "20", "22", "24", "26", "28"};
	String defaultMessage = "请选择或直接输入文字大小！";
	Font font = null;
	JComboBox<String> combo = null;
	JLabel label = null;
	
	public JComboBox8() {
		JFrame f = new JFrame("JComboBox");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		
		label = new JLabel("Swing", JLabel.CENTER);
		font = new Font("SansSerif", Font.PLAIN, 12);
		label.setFont(font);
		
		
		combo = new JComboBox<String>(fontsize);
		combo.setBorder(BorderFactory.createTitledBorder("请选择你要的文字大小"));
		combo.setEditable(true);
		ComboBoxEditor editor = combo.getEditor();
		combo.configureEditor(editor, defaultMessage);
		
		combo.addItemListener(this);
		combo.addActionListener(this);
		
		contentPane.add(label);
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
		new JComboBox8();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean isaddItem = true;
		int fontsize = 0;
		String tmp = (String) combo.getSelectedItem();
		
		try {
			fontsize = Integer.parseInt(tmp);
		
			for (int i = 0; i < combo.getItemCount(); i++) {
				if (combo.getItemAt(i).equals(tmp)) {
					isaddItem = false;
					break;
				}
			}
			
			if (isaddItem) {
				combo.insertItemAt(tmp, 0);
			}
			
			font = new Font("SansSerif", Font.PLAIN, fontsize);
			label.setFont(font);
			
		} catch (Exception e2) {
			combo.getEditor().setItem("你输入的不是整形数值，重新输入！");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			int fontsize = 0;
			
			try {
				
				fontsize = Integer.parseInt((String) e.getItem());
				label.setText("Swing目前字形带下：" + fontsize);
				
			} catch (Exception e2) {
				combo.getEditor().setItem("你输入的不是整形数值，重新输入！");
			}
			
		}
	}
	
}
