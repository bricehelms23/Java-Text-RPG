package net.bahelms.main;

public class Main {
	public static void main(String[] args) {
		GameLogic.printHeader("Testing methods.");
		GameLogic.enterToContinue();
		GameLogic.clearConsole();
		int input = GameLogic.readInt("Enter 1, 2, or 3: ", 3);
		System.out.println("You chose number: " + input + "!");
	}
}
