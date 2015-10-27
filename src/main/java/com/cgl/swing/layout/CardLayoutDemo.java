package com.cgl.swing.layout;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutDemo implements ActionListener{
	
	JPanel p1,p2,p3,p4;
	int i = 1;
	JFrame f;
	
	public CardLayoutDemo() {
		f = new JFrame();
		
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		
		p1 = new JPanel();
		Button b = new Button("Change Card");
		b.addActionListener(this);
		p1.add(b);
		contentPane.add(p1);
		
		p2 = new JPanel();//面板内容1
		p2.setLayout(new FlowLayout());
		p2.add(new JButton("first"));
		p2.add(new JButton("second"));
		p2.add(new JButton("third"));
		
		p3 = new JPanel();//面板内容2
		p3.setLayout(new GridLayout(3, 1));
		p3.add(new JButton("fourth"));
		p3.add(new JButton("fifth"));
		p3.add(new JButton("This is the last button"));
		
		p4 = new JPanel();//管理面板的容器
		p4.setLayout(new CardLayout());
		p4.add("one", p2);
		p4.add("two", p3);
		((CardLayout)p4.getLayout()).show(p4, "one");//通过面板容器和名称取面板内容
		//first第一个
		//next下一个
		//previous上一个
		//last最后一个
		//参数均是面板容器
		
		contentPane.add(p4);
		
		f.setTitle("CardLayout");
		f.pack();
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
		switch (i) {
		case 1:
			((CardLayout)p4.getLayout()).show(p4, "two");
			break;

		case 2:
			((CardLayout)p4.getLayout()).show(p4, "one");
			break;
		}
		i++;
		if (i == 3) {
			i = 1;
		}
		f.validate();//刷新界面
	}
	
	public static void main(String[] args) {
		new CardLayoutDemo();
	}
}
