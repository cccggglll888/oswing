package com.cgl.swing.pane.jscrollpane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class JScrollBar1 implements AdjustmentListener {
	
	JScrollBar scrollBar1;
	JScrollBar scrollBar2;
	JPanel panel1;
	JLabel label2 = new JLabel("刻度：", JLabel.CENTER);
	
	public JScrollBar1() {
		JFrame f = new JFrame("JScrollBarDemo");
		Container contentPane = f.getContentPane();
		
		JLabel label1 = new JLabel(new ImageIcon(getClass().getResource("img1.jpg")));
		panel1 = new JPanel();
		panel1.add(label1);
		scrollBar1 = new JScrollBar(JScrollBar.VERTICAL, 10, 10, 0, 100);
		scrollBar1.setUnitIncrement(1);
		scrollBar1.setBlockIncrement(10);
		scrollBar1.addAdjustmentListener(this);
		
		scrollBar2 = new JScrollBar();
		scrollBar2.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar2.setValue(0);
		scrollBar2.setVisibleAmount(20);
		scrollBar2.setMinimum(10);
		scrollBar2.setMaximum(60);
		scrollBar2.setBlockIncrement(5);
		scrollBar2.addAdjustmentListener(this);
		
		contentPane.add(panel1, BorderLayout.CENTER);
		contentPane.add(scrollBar1, BorderLayout.EAST);
		contentPane.add(scrollBar2, BorderLayout.SOUTH);
		contentPane.add(label2, BorderLayout.NORTH);
		
		f.setSize(new Dimension(200, 200));
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if ((JScrollBar)e.getSource() == scrollBar1) {
			label2.setText("垂直刻度：" + e.getValue());
		}
		if ((JScrollBar)e.getSource() == scrollBar2) {
			label2.setText("水平刻度：" + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		new JScrollBar1();
	}
}
