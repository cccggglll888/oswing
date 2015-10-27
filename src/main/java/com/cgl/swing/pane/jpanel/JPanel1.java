package com.cgl.swing.pane.jpanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel1 {
	public JPanel1() {
		JFrame f = new JFrame("JPanelDemo");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		JLabel[] label = new JLabel[5];
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("Label "+(i+1), JLabel.CENTER);
			label[i].setBackground(Color.LIGHT_GRAY);
			label[i].setBorder(BorderFactory.createEtchedBorder());
			// 组件变成不透明状，才能将设置的颜色显示出来
			label[i].setOpaque(true);
		}
		
		JPanel panel1 = new JPanel(new GridLayout(1, 1));
		panel1.add(label[0]);
		
		JPanel panel2 = new JPanel(new GridLayout(1, 2));
		
		JPanel panel3 = new JPanel(new GridLayout(1, 2));
		panel3.add(label[1]);
		panel3.add(label[2]);
		
		JPanel panel4 = new JPanel(new GridLayout(2, 1));
		panel4.add(label[3]);
		panel4.add(label[4]);
		
		panel2.add(panel3);
		panel2.add(panel4);
		
		contentPane.add(panel1);
		contentPane.add(panel2);
		
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
		new JPanel1();
	}
}
