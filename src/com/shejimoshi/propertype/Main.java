package com.shejimoshi.propertype;

import com.shejimoshi.propertype.framework.Manager;
import com.shejimoshi.propertype.framework.Product;

public class Main {

	public static void main(String args[]) {
		Manager manager = new Manager();
		UnderlinePen underlinePen = new UnderlinePen('~');
		MessageBox messageBox = new MessageBox('*');
		MessageBox messageBox1 = new MessageBox('/');
		manager.register("strong message", underlinePen);
		manager.register("waring box", messageBox);
		manager.register("slash box", messageBox1);
		Product product = manager.create("strong message");
		product.use("Hello, world");
		Product product1 = manager.create("waring box");
		product1.use("Hello, world");
		Product product2 = manager.create("slash box");
		product2.use("Hello, world");
		underlinePen.use("Hello, world");
	}
}
