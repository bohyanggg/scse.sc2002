package lab1;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter salary: ");
		int salary = in.nextInt();
		System.out.println("Enter merit points: ");
		int merit = in.nextInt();
		
		char grade = 0;
		
		if (salary>=500 && salary<=649) {
			if (salary<600 || salary>=600 && merit<10) grade ='C';
			else grade='B';
		}
		
		else if (salary>=600 && salary<=899) {
			if (salary>=700 && salary<=799 && merit<20) grade='B';
			else grade='A';
		}
		
		System.out.println("Grade " + grade);

	}

}
