package lab1;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter height: ");
		int height = in.nextInt();
		
		if (height<1) {
			System.out.println("Error input!!");
			System.exit(0);
		}
		
		int i, j;
		
		for (i=1; i<=height; i++) {
			//System.out.println();
			for (j=i; j>=1; j--) {
				if (j%2==0) System.out.print("BB");
				else System.out.print("AA");
			}
			System.out.println();
		}
	}
}
