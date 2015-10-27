package com.cgl.swing.pane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPane1_1 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JLayeredPane1_1() {
		super("JLayeredPane");
		Integer[] layerConstants = {JLayeredPane.DEFAULT_LAYER, 
				JLayeredPane.PALETTE_LAYER, new Integer(101), 
				JLayeredPane.MODAL_LAYER, new Integer(201), 
				JLayeredPane.POPUP_LAYER, JLayeredPane.DRAG_LAYER};
		Color[] colors = {Color.RED, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW, Color.GREEN, Color.PINK};
		
		Point position = new Point(10, 10);
		JButton[] button = new JButton[7];
		JLayeredPane layeredPane = getLayeredPane();
		
		for (int i = 0; i < 7; i++) {
			button[i] = createLabel("第 "+(i+1)+" 层", colors[i], position);
			position.x = position.x + 20;
			position.y = position.y + 20;
			layeredPane.add(button[i], layerConstants[i]);
		}
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2,2));
		JButton b1 = new JButton("按钮一");
		contentPane.add(b1);
		JButton b2 = new JButton("按钮二");
		contentPane.add(b2);
		JButton b3 = new JButton("按钮三");
		contentPane.add(b3);
		JButton b4 = new JButton("按钮四");
		contentPane.add(b4);
		
		System.out.println("ContentPane层次值为："+layeredPane.getLayer(contentPane));
		System.out.println("layeredPane层次值为："+JLayeredPane.getLayer(layeredPane));
		System.out.println("按钮一层次值为："+JLayeredPane.getLayer(b1));
		System.out.println("按钮二层次值为："+JLayeredPane.getLayer(b2));
		System.out.println("button[0]层次值为："+JLayeredPane.getLayer(button[0]));
		System.out.println("button[1]层次值为："+JLayeredPane.getLayer(button[1]));
		System.out.println("button[2]层次值为："+JLayeredPane.getLayer(button[2]));
		
		setSize(new Dimension(280, 280));
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public JButton createLabel(String content, Color color, Point position){
		JButton label = new JButton(content);
		label.setVerticalAlignment(JLabel.TOP);
		label.setBackground(color);
		label.setForeground(Color.BLACK);
		// 是否显示背景色，默认不显示
//		label.setOpaque(true);
		label.setBounds(position.x, position.y, 100, 100);
		return label;
	}
	
	public static void main(String[] args) {
		new JLayeredPane1_1();
	}
}
