package com.cgl.swing.pane.jscrollpane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JScrollPane1 implements ActionListener {
	JScrollPane scrollPane;
	
	public JScrollPane1() {
		JFrame f = new JFrame("JScrollPaneDemo");
		Container contentPane = f.getContentPane();
		
		JLabel label1 = new JLabel(new ImageIcon(getClass().getResource("img1.jpg")));
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		scrollPane = new JScrollPane(panel1);
		
		JPanel panel2 = new JPanel(new GridLayout(3, 1));
		JButton b = new JButton("显示水平滚动轴");
		b.addActionListener(this);
		panel2.add(b);
		
		b = new JButton("不显示水平滚动轴");
		b.addActionListener(this);
		panel2.add(b);
		
		b = new JButton("适时显示水平滚动轴");
		b.addActionListener(this);
		panel2.add(b);
		
		contentPane.add(panel2, BorderLayout.WEST);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		f.setSize(350, 220);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("显示水平滚动轴")) {
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		}
		if (e.getActionCommand().equals("不显示水平滚动轴")) {
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		}
		if (e.getActionCommand().equals("适时显示水平滚动轴")) {
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		}
	}
	
	public static void main(String[] args) {
		new JScrollPane1();
	}
}
