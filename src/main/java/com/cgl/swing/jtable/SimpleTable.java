package com.cgl.swing.jtable;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SimpleTable {
	public SimpleTable() {
		JFrame f = new JFrame();
		Object[][] playerInfo = {{"aa", new Integer(66), new Integer(32), new Integer(98), new Boolean(false)},
				{"bb", new Integer(85), new Integer(69), new Integer(154), new Boolean(true)}};
		
		String[] Name = {"AA", "BB", "CC", "DD"};
		
		JTable table = new JTable(playerInfo, Name);
		table.setPreferredScrollableViewportSize(new Dimension(550, 30));
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		f.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
//		JTable table = new JTable(playerInfo, Name);
//		table.setPreferredScrollableViewportSize(new Dimension(550, 30));
//		f.getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);
//		f.getContentPane().add(table, BorderLayout.CENTER);
		
		
		f.setTitle("Simple Table");
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
		new SimpleTable();
	}
}
