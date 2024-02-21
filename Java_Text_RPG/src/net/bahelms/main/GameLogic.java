package net.bahelms.main;
import java.util.Scanner;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Method that gets user input from the console.
	 * @param prompt 
	 * @param userChoices
	 * @return 
	 */
	public static int readInt(String prompt, int userChoices) {
		int input;
		
		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			}catch (Exception e) {
				input = -1;
				System.out.println("Please enter an integer!");
			}
		}while(input < 1 || input > userChoices);
		
		
		return input;	
	}
	
	public static void clearConsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
	public static void printSeparate(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void printHeader(String title) {
		printSeparate(30);
		System.out.println(title);
		printSeparate(30);
	}
	
	public static void enterToContinue() {
		System.out.println("\nEnter anything to continue.....");
		scanner.next();
	}
}
