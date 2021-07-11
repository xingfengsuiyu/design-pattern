package com.shejimoshi.Observer;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator numberGenerator) {
		System.out.print("DightObserver:" + numberGenerator.getNumber());
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
