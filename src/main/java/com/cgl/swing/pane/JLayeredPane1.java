package com.cgl.swing.pane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPane1 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JLayeredPane1() {
		super("JLayeredPane");
		Integer[] layerConstants = {JLayeredPane.DEFAULT_LAYER, 
				JLayeredPane.PALETTE_LAYER, new Integer(101), 
				JLayeredPane.MODAL_LAYER, new Integer(201), 
				JLayeredPane.POPUP_LAYER, JLayeredPane.DRAG_LAYER};
		Color[] colors = {Color.RED, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW, Color.GREEN, Color.PINK};
		
		Point position = new Point(10, 10);
		JLabel[] label = new JLabel[7];
		JLayeredPane layeredPane = getLayeredPane();
		
		for (int i = 0; i < 7; i++) {
			label[i] = createLabel("第 "+(i+1)+" 层", colors[i], position);
			position.x = position.x + 20;
			position.y = position.y + 20;
			layeredPane.add(label[i], layerConstants[i]);
		}
		
		setSize(new Dimension(280, 280));
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public JLabel createLabel(String content, Color color, Point position){
		JLabel label = new JLabel(content, JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setBackground(color);
		label.setForeground(Color.BLACK);
		// 是否显示背景色，默认不显示
		label.setOpaque(true);
		label.setBounds(position.x, position.y, 100, 100);
		return label;
	}
	
	public static void main(String[] args) {
		new JLayeredPane1();
	}
}
