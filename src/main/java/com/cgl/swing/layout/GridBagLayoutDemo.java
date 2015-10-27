package com.cgl.swing.layout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo {
	public GridBagLayoutDemo() {
		JButton b;
		GridBagConstraints c;
		int gridx, gridy, gridwidth, gridheight, anchor, fill, ipadx, ipady;
		double weightx, weighty;
		Insets inset;
		
		JFrame f = new JFrame();
		
		GridBagLayout gridbag = new GridBagLayout();
		Container contentPane = f.getContentPane();
		contentPane.setLayout(gridbag);
		
		b = new JButton("first");
		// 控件坐标
		gridx = 0;
		gridy = 0;
		// 控件宽度高度
		gridwidth = 1;
		gridheight = 1;
		// 控件随窗口调整放大比例
		weightx = 10;
		weighty = 1;
		// 当控件空间大于控件本身，控件的位置，默认居中
		anchor = GridBagConstraints.CENTER;
		// 控件如何处理多余的空间，填充方式
		fill = GridBagConstraints.HORIZONTAL;
		// 控件之间的间距，相当于是外间距
		inset = new Insets(0, 0, 0, 0);
		// 内容与空间间距离，相当于是内间距
		ipadx = 0;
		ipady = 0;
		// 位置对象
		c = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, inset, ipadx, ipady);
		// 布局控制器设置，控件对象，位置对象
		gridbag.setConstraints(b, c);
		// 控件加入面板
		contentPane.add(b);
		
		b = new JButton("second");
		gridx = 1;
		gridy = 0;
		gridwidth = 2;
		gridheight = 1;
		weightx = 1;
		weighty = 1;
		anchor = GridBagConstraints.CENTER;
		fill = GridBagConstraints.HORIZONTAL;
		inset = new Insets(0, 0, 0, 0);
		ipadx = 50;
		ipady = 0;
		c = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, inset, ipadx, ipady);
		gridbag.setConstraints(b, c);
		contentPane.add(b);
		
		b = new JButton("third");
		gridx = 0;
		gridy = 1;
		gridwidth = 1;
		gridheight = 1;
		weightx = 1;
		weighty = 1;
		anchor = GridBagConstraints.CENTER;
		fill = GridBagConstraints.HORIZONTAL;
		inset = new Insets(10, 0, 0, 0);
		ipadx = 0;
		ipady = 50;
		c = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, inset, ipadx, ipady);
		gridbag.setConstraints(b, c);
		contentPane.add(b);
		
		b = new JButton("fourth");
		gridx = 1;
		gridy = 1;
		gridwidth = 1;
		gridheight = 1;
		weightx = 1;
		weighty = 1;
		anchor = GridBagConstraints.CENTER;
		fill = GridBagConstraints.HORIZONTAL;
		inset = new Insets(0, 0, 0, 0);
		ipadx = 0;
		ipady = 0;
		c = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, inset, ipadx, ipady);
		gridbag.setConstraints(b, c);
		contentPane.add(b);
		
		b = new JButton("This is the last button");
		gridx = 2;
		gridy = 1;
		gridwidth = 1;
		gridheight = 2;
		weightx = 1;
		weighty = 1;
		anchor = GridBagConstraints.SOUTH;
		fill = GridBagConstraints.HORIZONTAL;
		inset = new Insets(0, 0, 0, 0);
		ipadx = 0;
		ipady = 0;
		c = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, inset, ipadx, ipady);
		gridbag.setConstraints(b, c);
		contentPane.add(b);
		
		f.setTitle("GridBagLayout");
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
		new GridBagLayoutDemo();
	}
}
