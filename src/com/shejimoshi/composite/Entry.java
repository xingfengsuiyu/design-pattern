package com.shejimoshi.composite;

public abstract class Entry {

	public abstract String getName();

	public abstract int getSize();

	protected abstract void printList(String prefix);

	public void add(Entry entry) throws FileTreatemtException {
		throw new FileTreatemtException();
	}
	public void printList() {
		printList("");
	}

	@Override
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
