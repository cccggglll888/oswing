package com.cgl.swing.layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo {
	public FlowLayoutDemo() {
		JFrame f = new JFrame();
		
		Container contentPane = f.getContentPane();
		
		FlowLayout fl = new FlowLayout();
		//FlowLayout.LEFT 
		//FlowLayout.RIGHT 
		//FlowLayout.CENTER-默认 
		//FlowLayout.LEADING 
		//FlowLayout.TRAILING 
		fl.setAlignment(FlowLayout.CENTER);
		//fl.setHgap(0);
		//fl.setVgap(0);
		//默认false
		fl.setAlignOnBaseline(true);
		
		contentPane.setLayout(fl);
		
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("third"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));
		contentPane.add(new JButton("This is the last button"));
		
		f.setTitle("FlowLayout");
		f.setSize(getPreferredSize());
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}
	
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}
