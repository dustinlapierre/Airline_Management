
public class Standard_Seat implements Seat {

	private double seatPrice;
	private String seatNum;
	private boolean available;

	
	public double getSeatPrice() {
		return seatPrice;
	}
	
	
	public String getSeatNumber() {
		return seatNum;
	}
	
	public boolean checkAvailable(){
		return available;
	}
	
	public void setAvailability(boolean val){
		available = val;
	}
}
   