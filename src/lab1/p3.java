package lab1;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usd;
		double sgd;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter starting value: ");
		int start = in.nextInt();
		System.out.println("Enter ending value: ");
		int end = in.nextInt();
		System.out.println("Enter increment: ");
		int inc = in.nextInt();
		
		// Error Case
		if (start>end) {
			System.out.println("Error input!!");
			System.exit(0);
		}
		
		String gap = " ";
		
		// Using for loop
		System.out.println("\nUS$         S$   //for loop");
		System.out.println("--------------");
		for (usd=start; usd<=end; usd+=inc) {
			sgd = usd*1.82;
			System.out.println(usd + gap.repeat(11) + sgd);
		}
		
		// Using while loop
		System.out.println("\nUS$         S$   //while loop");
		System.out.println("--------------");
		usd = start;
		while (usd<=end) {
			sgd = usd*1.82;
			System.out.println(usd + gap.repeat(12-String.valueOf(usd).length()) + sgd);
			usd += inc;
		}
		
		// Using do/while loop
		System.out.println("\nUS$         S$   //do-while loop");
		System.out.println("--------------");
		usd = start;
		do {
			sgd = usd*1.82;
			System.out.println(usd + gap.repeat(12-String.valueOf(usd).length()) + sgd);
			usd += inc;
		}
		while (usd<=end);

	}

}
