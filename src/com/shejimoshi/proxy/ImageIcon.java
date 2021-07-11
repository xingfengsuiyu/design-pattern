package com.shejimoshi.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

public class ImageIcon {

	private Image image;

	public ImageIcon(Image image2) {
	}

	public ImageIcon(URL systemResource) {
		// TODO Auto-generated constructor stub
	}

	public int getIconHeight() {
		return 0;
	}

	public int getIconWidth() {
		return 0;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {

	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Image getImage() {
		return image;
	}

}
