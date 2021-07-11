package com.shejimoshi.propertype;

import com.shejimoshi.propertype.framework.Product;

public class MessageBox extends Product{  //implements Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.print(decochar + " " + s + " " + decochar);
		System.out.println("");
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	/*@Override
	public Product createClone() {
		Product p  = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}*/
}
