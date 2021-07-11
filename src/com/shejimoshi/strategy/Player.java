package com.shejimoshi.strategy;

public class Player {

	private Strategy strategy;
	private String name;
	private int wincount;
	private int losecount;
	private int gamecount;

	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() {
		return strategy.nextHand();
	}

	public void win () {
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void evnt() {
		gamecount++;
	}

	public String toString() {
		return "[ " + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose]";
	}
}
