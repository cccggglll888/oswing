package com.cgl.swing.oswing;

import java.awt.Component;
import java.awt.Container;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

public class Simpl {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRootPane rp = jf.getRootPane();
		
		Component gp = jf.getGlassPane();
		JLayeredPane lp = jf.getLayeredPane();
		
		Container cp = jf.getContentPane();
		MenuBar mb = jf.getMenuBar();
		JMenuBar mbj = jf.getJMenuBar();
		
		
		gp.setVisible(true);
		jf.setVisible(true);
	}
}
