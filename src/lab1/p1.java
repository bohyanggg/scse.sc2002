package lab1;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		try(Scanner in = new Scanner(System.in)) {
		String userInput = in.next().toUpperCase();
		switch(userInput) {
			case "A": System.out.println("Action movie fan"); break;
			case "C": System.out.println("Comedy movie fan"); break;
			case "D": System.out.println("Drama movie fan"); break;
			default: System.out.println("Invalid choice");
			}
		}

	}

}
