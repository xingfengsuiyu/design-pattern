package com.shejimoshi.propertype.framework;

public abstract class Product implements Cloneable {
	 public abstract void use(String s);
	 public Product createClone() {
		 try {
			 return (Product) clone();
		 } catch (CloneNotSupportedException e) {
			 e.printStackTrace();
		 }
		 return null;
	 }
}
