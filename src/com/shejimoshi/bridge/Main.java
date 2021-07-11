package com.shejimoshi.bridge;

public class Main {
	public static  void main(String []args) {
		Display display = new Display(new StringDisplayImpl("Hello, China."));
		Display display1 = new Display((new StringDisplayImpl("Hello, World")));
		CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));

		display.display();
		display1.display();
		display3.display();
		display3.multiDisplay(4);
	}

}
