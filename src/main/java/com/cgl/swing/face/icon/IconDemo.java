package com.cgl.swing.face.icon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.annotation.Generated;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IconDemo implements Icon {
	
	int height = 50;
	int width = 70;
	
	@Override
	public int getIconHeight() {
		return height;
	}
	
	@Override
	public int getIconWidth() {
		return width;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLUE);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("IconDemo");
		Container contentPane = f.getContentPane();
		
		Icon icon = new IconDemo();
		JLabel label = new JLabel(icon, JLabel.CENTER);
		contentPane.add(label);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

	
	
}
