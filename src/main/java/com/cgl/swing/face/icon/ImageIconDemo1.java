package com.cgl.swing.face.icon;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIconDemo1 {
	public static void main(String[] args) {
		byte[] image = null;
		
		JFrame f = new JFrame("ImageIconDemo");
		Container contentPane = f.getContentPane();
		
		try {
		File file = new File(ClassLoader.getSystemResource("gif.gif").toString().substring(5));
		int size = (int)file.length();
		FileInputStream in = new FileInputStream(file);
		image = new byte[size];
		in.read(image);
		in.close();
		
		//TODO 使用classloader的输入流
//		InputStream ins = ClassLoader.getSystemResourceAsStream("gif.gif");
//		ins.read(image);
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Icon icon = new ImageIcon(image);
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
