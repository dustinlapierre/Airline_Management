
public class VIP_Seat implements Seat {
	
	//VIP_Seat class done by Dustin Lapierre
	
	private double seatPrice;
	private String seatNum;
	private boolean available;

	
	VIP_Seat(String num) {
		seatNum = num;
		seatPrice = 350.27;
		available = true;
	}
	
	public double getSeatPrice() {
		return seatPrice;
	}
	
	public String getSeatNumber() {
		return seatNum;
	}
	
	public void setSeatPrice(double price) {
		seatPrice = price;
	}
	
	public void setSeatNumber(String num) {
		seatNum = num;
	}

	@Override
	public String toString() {
		return "VIP_Seat [seatPrice=" + seatPrice + ", seatNum=" + seatNum + "]";
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean val) {
		available = val;
	}
	
	
}
