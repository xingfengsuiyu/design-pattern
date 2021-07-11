package com.shejimoshi.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.JFrame;

public class ImageIconProxy extends ImageIcon implements Runnable {

	public ImageIconProxy(Image systemResource) {
		super(systemResource);
	}

	static final ImageIcon ABSENT = new ImageIcon(ClassLoader.getSystemResource("image/absent.jpg"));
	static final ImageIcon LOADING = new ImageIcon(ClassLoader.getSystemResource("image/loading.jpg"));

	ImageIcon current = ABSENT;
	protected String filename;
	protected JFrame callbackFrame;

	public ImageIconProxy(String filename) {
		super(ABSENT.getImage());
		this.filename = filename;
	}

	public void load(JFrame callbackFrame) {
		this.callbackFrame = callbackFrame;
		current = LOADING;
		callbackFrame.repaint();
		new Thread(this).start();
	}

	@Override
	public void run() {
		current = new ImageIcon(ClassLoader.getSystemResource(filename));
		callbackFrame.pack();
	}

	public int getIconHeight() {
		return current.getIconHeight();
	}

	public int getIconWidth() {
		return current.getIconWidth();
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		current.paintIcon(c, g, x, y);
	}
}
