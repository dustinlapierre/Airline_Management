
public class VIP_Seat implements Seat {
	
	private double seatPrice;
	private String seatNum;
	//private boolean available;

	
	VIP_Seat(String num){
		seatNum = num;
		seatPrice = 350.27;
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
	
	/*public boolean checkAvailable(){
		return available;
	}
	
	public void setAvailability(boolean val){
		available = val;
	}*/
	
	
}
