package com.shejimoshi.builder;

public class TextBuilder implements Builder {

	public StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buffer.append(title + "\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append(str + "\n");
	}

	@Override
	public void makeItems(String[] items) {
		buffer.append(items + "\n");
	}

	@Override
	public void close() {
		buffer.append("\n");
	}

	public String getResult() {
		return buffer.toString();
	}
}
