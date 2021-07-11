package com.shejimoshi.factory.simplefactory.framework;

public abstract class Factory {

	private Product product;

	public final Product  create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	public abstract Product createProduct(String owner);

	public abstract void registerProduct(Product product);
}
