package com.cgl.swing.event.mouse;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MouseDemo3 extends JFrame implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	int flag;
	int x = 0;
	int y = 0;
	int startx, starty, endx, endy;
	
	public MouseDemo3() {
		Container contentPane = getContentPane();
		
		contentPane.addMouseListener(this);
		contentPane.addMouseMotionListener(this);
		
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		startx = e.getX();
		starty = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		endx = e.getX();
		endy = e.getY();
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
	// ================
	@Override
	public void mouseMoved(MouseEvent e) {
		flag = 1;
		x = e.getX();
		y = e.getY();
		
		
		repaint();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		flag = 2;
		x = e.getX();
		y = e.getY();
		
		
		repaint();
	}
	@Override
	public void update(Graphics g) {
		g.setColor(this.getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		paint(g);
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(this.getBackground());
		g.fillRect(0, 0, 200, 55);
		
		g.setColor(Color.BLACK);
		if (flag == 1) {
			g.drawString("鼠标坐标：（"+x+"，"+y+"）", 10, 50);
			g.drawLine(startx, starty, endx, endy);
		}
		if (flag == 2) {
			g.drawString("拖拽鼠标坐标：（"+x+"，"+y+"）", 10, 50);
			g.drawLine(startx, starty, x, y);
			startx = x;
			starty = y;
		}
	}
	
	public static void main(String[] args) {
		new MouseDemo3();
	}
}
