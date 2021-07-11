package com.shejimoshi.Observer;

public class GraphObserver implements Observer {
	@Override
	public void update(NumberGenerator numberGenerator) {
		System.out.print("GraphObserver:");
		int count = numberGenerator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
