package com.shejimoshi.strategy;

	public interface Strategy {
		Hand nextHand();
		void study(boolean win);
}
