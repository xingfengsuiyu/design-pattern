package com.shejimoshi.singleton;

public class TicketMarker {
	private static TicketMarker ticketMarker = new TicketMarker();

	private int ticket = 1000;

	private TicketMarker() {
		System.out.println("生成了一个实例");
	}

	public int getNextTicketNumber() {
		return ticket++;
	}

	public static TicketMarker getInstance() {
		return ticketMarker;
	}

}
