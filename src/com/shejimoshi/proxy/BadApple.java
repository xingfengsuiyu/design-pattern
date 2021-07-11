package com.shejimoshi.proxy;

public class BadApple {

	public String name;

	public BadApple(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BadApple)) {
			return false;
		}
		BadApple f = (BadApple) obj;
		return name.equals(f.name);
	}

	public String toString() {
		return name;
	}
}
