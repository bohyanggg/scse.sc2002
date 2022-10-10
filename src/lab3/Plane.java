package lab3;

public class Plane {
	//instance variable
	private PlaneSeat[] seat;
	private int numEmptySeat;
	
	//constructor
	public Plane () {
		this.seat = new PlaneSeat [12];
		for (int i=0;i<12;i++) {
			this.seat[i] = new PlaneSeat(i+1);
		}
		this.numEmptySeat = 12;
	}
	
	//class methods
	private PlaneSeat[] sortSeats () {
		int k = 0;
		PlaneSeat temp;
		PlaneSeat [] seatCopy = new PlaneSeat [12-numEmptySeat];
		
		for (int i=0;i<12;i++) {
			if (seat[i].getCustomerID() != 0) {
				seatCopy[k] = seat[i];
				k++;
			}
		}
		//insertion sort to sort seats 
		for (int j=1; j<12-numEmptySeat; j++) {
	        while (j > 0 && seatCopy[j].getCustomerID() < seatCopy[j-1].getCustomerID()){
	            temp = seatCopy[j];
	            seatCopy[j] = seatCopy[j-1];
	            seatCopy[j-1] = temp;
	            j--;
	        }
		}
		/* other insertion sort algo
		for (int i=1; i<12-numEmptySeat; i++) {
			if (seatCopy[i].getCustomerID() < seatCopy[i-1].getCustomerID()) {
				temp = seatCopy[i-1];
				seatCopy[i-1] = seatCopy[i];
				seatCopy[i] = temp;
			}
			for (int j=i-1; j>0; j--) {
				if (seatCopy[j].getCustomerID() < seatCopy[j-1].getCustomerID()) {
					temp = seatCopy[j-1];
					seatCopy[j-1] = seatCopy[j];
					seatCopy[j] = temp;
				}
			}
		}
		*/
		return seatCopy;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats.");
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for (int i=0; i<seat.length;i++) {
			if (this.seat[i].isOccupied() == false) {
				System.out.println("SeatID " + (i+1));
			}
		}
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		System.out.println("The seat assignments are as follows:");
		if (bySeatId) {
			for (int i=0; i<seat.length; i++) {
				if (seat[i].isOccupied()) {
					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID());
				}
			}
		}
		//else by customerId
		else {
			PlaneSeat [] seatCopy = sortSeats();
			for (int i=0; i< (seat.length) - numEmptySeat; i++) {
					System.out.println("SeatID " + seatCopy[i].getSeatID() + " assigned to CustomerID " + seatCopy[i].getCustomerID());
			}
		}
	}
	
	public void assignSeat(int seatId, int cust_id) {
		if (seat[seatId-1].isOccupied() == false) {
			seat[seatId-1].assign(cust_id);
			System.out.println("Seat Assigned!");
			numEmptySeat--;
		}
		//else seat already occupied
		else {
			System.out.println("Seat already assigned to a customer.");
		}
	}
	
	public void unAssignSeat(int seatId) {
		if (seatId-1 > 12 || seatId < 1) {
			System.out.println("Wrong SeatId, there are only 12 seats.");
		}
		else if (seat[seatId-1].isOccupied() == true) {
			seat[seatId-1].unAssign();
			System.out.println("Seat Unassigned!");
			numEmptySeat++;
		}
		else {
			System.out.println("Seat is already empty.");
		}
	}
}
