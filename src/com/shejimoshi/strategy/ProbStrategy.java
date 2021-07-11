package com.shejimoshi.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
	private Random random;
	private Hand pervHand = Hand.getHand(0);
	private boolean won = false;

	public ProbStrategy(int seed) {
		random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		if (won) {
			pervHand = Hand.getHand(random.nextInt(3));
		}
		return pervHand;
	}

	@Override
	public void study(boolean win) {
		won = win;
	}
}
