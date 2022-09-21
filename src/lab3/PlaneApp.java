package lab3;

import java.util.Scanner;

public class PlaneApp {

	public static void main(String[] args) {
		
		int userInput, seatId, cust_id;
		Scanner sc = new Scanner(System.in);
		Plane planeObj = new Plane();
		
		System.out.println("(1) Show number of empty seats\n" +
						   "(2) Show the list of empty seats\n" +
						   "(3) Show the list of seat assignments by seat ID\n" +
						   "(4) Show the list of seat assignments by customer ID\n" +
						   "(5) Assign a customer to a seat\n" +
						   "(6) Remove a seat assignment\n" +
						   "(7) Exit");
		
		while (true) {
			System.out.print("\n   Enter the number of your choice: ");
			userInput = sc.nextInt();
			switch(userInput) {
				case 1: planeObj.showNumEmptySeats(); break;
				case 2: planeObj.showEmptySeats(); break;
				case 3: planeObj.showAssignedSeats(true); break;
				case 4: planeObj.showAssignedSeats(false); break;
				case 5: System.out.println("Assigning Seat ..");
						System.out.print("   Please enter SeatID: ");
						seatId = sc.nextInt();
						System.out.print("   Please enter Customer ID: ");
						cust_id = sc.nextInt();
						planeObj.assignSeat(seatId, cust_id); 
						break;
				case 6: System.out.print("Enter SeatID to unassign customer from: ");
						seatId = sc.nextInt();
						planeObj.unAssignSeat(seatId); 
						break;
				case 7: System.exit(0);
				default: System.out.println("Error");
			}
		}
	}
}
