package com.cgl.swing.pane.jtabbedpane;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPane1 {
	public JTabbedPane1() {
		JFrame f = new JFrame("JTabbedPaneDemo");
		Container contentPane = f.getContentPane();
		
		JLabel label1 = new JLabel(new ImageIcon(getClass().getResource("img1.jpg")));
		System.out.println(getClass().getResource("img1.jpg"));
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		
		JLabel label2 = new JLabel("Label 2", JLabel.CENTER);
		label2.setBackground(Color.PINK);
		label2.setOpaque(true);
		JPanel panel2 = new JPanel();
		panel2.add(label2);
		
		JLabel label3 = new JLabel("Label 3", JLabel.CENTER);
		label3.setBackground(Color.YELLOW);
		label3.setOpaque(true);
		JPanel panel3 = new JPanel();
		panel3.add(label3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		//1标签名称，2图片路径，3面板，4标签提示文字
		//1标签名称，2图片路径，3面板
		//1标签名称，2面板
		tabbedPane.addTab("Picture", new ImageIcon(getClass().getResource("imgs.jpg")), panel1, "图案");
		tabbedPane.addTab("Label 2", panel2);
		tabbedPane.addTab("Label 3", null, panel3, "tabel");
		
		contentPane.add(tabbedPane);
		
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
		new JTabbedPane1();
	}
}
