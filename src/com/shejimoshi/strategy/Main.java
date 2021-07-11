package com.shejimoshi.strategy;

public class Main {
	public static void main(String []args) {
		if (args.length != 2) {
			System.out.println("Usage: java main randomseed1 randomseed2");
			System.out.println("Example: java main 314 15");
			System.exit(0);
		}
		Integer seed1 = Integer.parseInt(args[0]);
		Integer seed2 = Integer.parseInt(args[1]);
		Player player1 = new Player("Taro", new WinningStrategy(seed1));
		Player player2 = new Player("Hana", new ProbStrategy(seed2));
		for (int i = 0; i < 1000; i++) {
			Hand hand1 = player1.nextHand();
			Hand hand2 = player2.nextHand();
			if (hand1.isStrongerThan(hand2)) {
				System.out.println("Winner:" + player1);
				player1.win();
				player2.lose();
			} else if (hand1.isWeakerThan(hand2)) {
				System.out.println("Winner:" + player2);
				player2.win();
				player1.lose();
			} else {
				System.out.println("Evnt...");
				player1.evnt();
				player2.evnt();
			}
		}
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
}
