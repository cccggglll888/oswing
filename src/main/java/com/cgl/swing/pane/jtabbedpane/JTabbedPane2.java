package com.cgl.swing.pane.jtabbedpane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPane2 implements ActionListener, ChangeListener {
	int index = 0;
	int newNumber = 1;
	JTabbedPane tabbedPane = null;

	public JTabbedPane2() {
		JFrame f = new JFrame("JTabbedPaneDemo");
		Container contentPane = f.getContentPane();
		
		JLabel label1 = new JLabel(new ImageIcon(getClass().getResource("img1.jpg")));
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		
		JLabel label2 = new JLabel("Label 2", JLabel.CENTER);
		label2.setBackground(Color.PINK);
		label2.setOpaque(true);
		JPanel panel2 = new JPanel();
		panel2.add(label2);
		
		JLabel label3 = new JLabel("Label 3", JLabel.CENTER);
		label2.setBackground(Color.YELLOW);
		label2.setOpaque(true);
		JPanel panel3 = new JPanel();
		panel3.add(label3);
		
		tabbedPane = new JTabbedPane();
		tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
		tabbedPane.addChangeListener(this);
		tabbedPane.addTab("Picuute", new ImageIcon(getClass().getResource("imgs.jpg")), panel1, "图案");
		tabbedPane.addTab("Label 2", panel2);
		tabbedPane.addTab("Lable 3", null, panel3, "label");
		
		tabbedPane.setEnabledAt(2, false);//设置3号不可用状态
		
		JButton b = new JButton("新增标签");
		b.addActionListener(this);
		
		contentPane.add(b, BorderLayout.NORTH);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (index != tabbedPane.getSelectedIndex()) {
			if (index < tabbedPane.getTabCount() - 1) {
				tabbedPane.setEnabledAt(index+1, true);
			}
		}
		index = tabbedPane.getSelectedIndex();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel panel = new JPanel();
		tabbedPane.addTab("new " + newNumber, panel);
		tabbedPane.setEnabledAt(newNumber+2, false);
		newNumber++;
		tabbedPane.validate();
		
	}
	
	public static void main(String[] args) {
		new JTabbedPane2();
	}
}
