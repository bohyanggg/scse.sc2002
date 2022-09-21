package lab3;

public class PlaneSeat {
	//private variables
	private int seatId;
	private boolean assigned;
	private int customerId;
	
	//constructor
	public PlaneSeat (int seatId) {
		this.seatId = seatId;
		this.assigned = false;
		this.customerId = 0;
	}
	
	//class methods
	public int getSeatID () {
		return seatId;
	}
	
	public int getCustomerID () {
		return customerId;
	}
	
	public boolean isOccupied () {
		return assigned;
	}
	
	public void assign (int customerId) {
		assigned = true;
		this.customerId = customerId;
	}
	
	public void unAssign () {
		assigned = false;
		this.customerId = 0;
	}
}
