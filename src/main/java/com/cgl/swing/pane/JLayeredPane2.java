package com.cgl.swing.pane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPane2 extends JFrame {
	private static final long serialVersionUID = 1L;

	public JLayeredPane2() {
		super("JLayeredPane");
		
		JLabel label1 = new JLabel("左Label", JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setBackground(Color.RED);
		label1.setForeground(Color.BLACK);
		label1.setOpaque(true);
		label1.setBounds(20, 20, 150, 150);
		
		JLabel label2 = new JLabel("右Label", JLabel.CENTER);
		label2.setVerticalAlignment(JLabel.TOP);
		label2.setBackground(Color.GREEN);
		label2.setForeground(Color.BLACK);
		label2.setOpaque(true);
		label2.setBounds(50, 50, 150, 150);
		
		JLayeredPane layeredPane = getLayeredPane();
		layeredPane.add(label1, new Integer(10), 1);
		layeredPane.add(label2, new Integer(10), 0);
		
		setSize(new Dimension(280, 280));
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new JLayeredPane2();
	}
}
