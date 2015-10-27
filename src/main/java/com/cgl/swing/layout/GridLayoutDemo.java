package com.cgl.swing.layout;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {
	public GridLayoutDemo() {
		JFrame f = new JFrame();
		
		Container contentPane = f.getContentPane();
		
		GridLayout gl = new GridLayout(6, 1);
		gl.setHgap(0);
		gl.setVgap(0);
		//gl.setColumns(0);
		//gl.setRows(0);
		
		contentPane.setLayout(gl);
		
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("third"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));
		contentPane.add(new JButton("this is the last button"));
		
		f.setTitle("GridLayout");
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
		new GridLayoutDemo();
	}
}
