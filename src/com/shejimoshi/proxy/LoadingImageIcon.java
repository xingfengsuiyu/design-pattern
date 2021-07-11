package com.shejimoshi.proxy;

import java.awt.Image;

import javax.swing.JFrame;

public class LoadingImageIcon extends ImageIcon implements Runnable {

	public LoadingImageIcon(Image image2) {
		super(image2);
		// TODO Auto-generated constructor stub
	}

	static final ImageIcon ABSENT = new ImageIcon(ClassLoader.getSystemResource("image/absent.jpg"));
	static final ImageIcon LOADING = new ImageIcon(ClassLoader.getSystemResource("image/loading.jpg"));

	protected String filename;
	protected JFrame callbackFrame;

	public LoadingImageIcon(String filename) {
		super(ABSENT.getImage());
		this.filename = filename;
	}

	public void load(JFrame callbackFrame) {
		setImage(LOADING.getImage());
		callbackFrame.repaint();
		new Thread(this).start();
	}

	@Override
	public void run() {
		setImage(new ImageIcon(ClassLoader.getSystemResource(filename)).getImage()
		);
		callbackFrame.pack();
	}

}
