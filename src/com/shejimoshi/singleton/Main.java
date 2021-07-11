package com.shejimoshi.singleton;

public class Main {
	public static void main(String args[]) throws Exception{
		for (int i = 0; i < 1; i++) {
			System.out.println(TicketMarker.getInstance().getNextTicketNumber());
		}
		for (int i = 0; i < 9; i++) {
			System.out.println(Triple.getInstance(i%3));
		}
	}
}
