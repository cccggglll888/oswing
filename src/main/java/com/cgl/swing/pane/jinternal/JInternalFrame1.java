package com.cgl.swing.pane.jinternal;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

public class JInternalFrame1 extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JDesktopPane desktopPane;
	int count = 1;
	
	public JInternalFrame1() {
		super("JInternalFrame1");
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JButton b = new JButton("Create New Internal Frames");
		b.addActionListener(this);
		contentPane.add(b, BorderLayout.SOUTH);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		
		setSize(350, 350);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JInternalFrame internalFrame = new JInternalFrame("Internal Frame"+(count++), true, true, true, true);
		internalFrame.setLocation(20, 20);
		internalFrame.setSize(200, 200);
		internalFrame.setVisible(true);
		
		Container icontentPane = internalFrame.getContentPane();
		JTextArea textArea = new JTextArea();
		JButton b = new JButton("Internal Frame Button");
		icontentPane.add(textArea, "Center");
		icontentPane.add(b, "South");
		
		desktopPane.add(internalFrame);
		
		try {
			internalFrame.setSelected(true);
		} catch (PropertyVetoException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new JInternalFrame1();
	}
}
