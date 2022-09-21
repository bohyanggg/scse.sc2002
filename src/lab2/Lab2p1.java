package lab2;

import java.util.Scanner;

public class Lab2p1 {

	public static void main(String[] args) {
	
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Perform the following methods:");
		System.out.println("1: miltiplication test");
		System.out.println("2: quotient using division by subtraction");
		System.out.println("3: remainder using division by subtraction");
		System.out.println("4: count the number of digits");
		System.out.println("5: position of a digit");
		System.out.println("6: extract all odd digits");
		System.out.println("7: quit");
		choice = sc.nextInt();
		switch (choice) {
			case 1: mulTest();
			break;
			case 2: 
				System.out.println("Enter m value");
				Scanner in = new Scanner(System.in);
				int m = in.nextInt();
				System.out.println("Enter n value");
				int n = in.nextInt();
				int ans = divide(m, n);
				System.out.println(m + "/" + n + "=" + ans);
			break;
			case 3: 
				System.out.println("Enter m value");
				Scanner in2 = new Scanner(System.in);
				int a = in2.nextInt();
				System.out.println("Enter n value");
				int b = in2.nextInt();
				int mod_ans = modulus(a, b);
				System.out.println(a + "%" + b + "=" + mod_ans);
			break;
			case 4: 
				System.out.println("Enter n value");
				Scanner in3 = new Scanner(System.in);
				int c = in3.nextInt();
				int answer = countDigits(c);
				if (answer == -1) System.out.println("n: " + c + "- error input");
				else {
					System.out.println("n: " + c + " - count = " + answer);
				}
				
			break;
			case 5: 
				System.out.print("Enter positive number: ");
				n = sc.nextInt();
				System.out.print("Enter digit: ");
				int digit = sc.nextInt();
				System.out.println("position = " + position(n, digit) + "\n");

			break;
			case 6:
				System.out.print("Enter positive number: ");
				n = sc.nextInt();
				if (n < 0) {
					System.out.println("oddDigits = Error input!!\n");
					break;
				}
				else System.out.println("oddDigits = " + extractOddDigits(n) + "\n");
			break;
			case 7: System.out.println("Program terminating ...");
			}
		} while (choice < 7);
		sc.close();
	}
	
	public static void mulTest() {
		int x, y, ans, count=0;
		for (int i=0;i<5;i++) {
			x = (int) (Math.random() * 10);
			y = (int) (Math.random() * 10);
			ans = x * y;
			Scanner in = new Scanner(System.in);
			System.out.println("How much is " + x + "times " + y);
			int yourans = in.nextInt();
			if (yourans == ans) {
				count++;
			}
		}
		System.out.println(count + " answers out of 5 are correct");
	}
	
	public static int divide(int m, int n) {
		int count=0;
		while((m - n) >= 0) {
			m=m-n;
			count++;
		}
		return count;
	}
	
	public static int modulus(int m, int n) {
		if((m-n) < 0) {
			return m;
		}
		else {
			while((m - n) >= 0) {
			m = m - n;
			}
			return m;
		}
	}
	
	public static int countDigits(int n) {
		if (n < 0) return -1;
		int count = 0;

	    while (n != 0) {
	      n /= 10;
	      ++count;
	    }
	    return count;
	}
	
	public static int position(int n, int digit) {
		String str = Integer.toString(n);
		char character = (char) (digit + '0');
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == character) {
				return str.length()-i;
			}
		}
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		
		String str = Long.toString(n);
		String oddStr = "";
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == '1' || str.charAt(i) == '3' || str.charAt(i) == '5' || str.charAt(i) == '7' || str.charAt(i) == '9') {
				oddStr += str.charAt(i);
			}
		}
		if (oddStr == "") return -1;
		else {
			long oddDigits = Long.parseLong(oddStr);
			return oddDigits;
		}
	}
}