package com.cgl.swing.face.border;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class BorderDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame("BorderDemo");
		Container content = f.getContentPane();
		JLabel label = new JLabel();
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.RED, Color.BLUE));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN));
		label.setBorder(BorderFactory.createEtchedBorder());
		label.setBorder(BorderFactory.createEtchedBorder(Color.RED, Color.BLUE));
		label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		label.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.GREEN));
		label.setBorder(BorderFactory.createMatteBorder(35, 35, 35, 35, new ImageIcon(ClassLoader.getSystemResource("imgs.jpg"))));
		label.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLUE, 5), BorderFactory.createMatteBorder(35, 35, 35, 35, new ImageIcon(ClassLoader.getSystemResource("imgs.jpg")))));
		label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE, 5), "Line Border", TitledBorder.CENTER, TitledBorder.TOP));
		label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE, 5), "Line Border", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("SansSerit", Font.ITALIC, 14), Color.RED));
		
		content.add(label);
		f.setSize(200, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
