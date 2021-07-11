package com.shejimoshi.factory.simplefactory;

import com.shejimoshi.factory.simplefactory.framework.Factory;
import com.shejimoshi.factory.simplefactory.framework.Product;
import com.shejimoshi.factory.simplefactory.idcard.IDCardFactory;

public class Main {
	public static void main(String args[])
	{
		Factory factory = new IDCardFactory();
		Product p = factory.create("小米");
		Product p2 = factory.create("小红");
		Product p3 = factory.create("小刚");
		p.use();
		p2.use();
		p3.use();
	}
}
