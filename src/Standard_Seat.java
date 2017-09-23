
public class Standard_Seat implements Seat {

	private double seatPrice;
	private String seatNum;
	private boolean available;
	
	Standard_Seat(String num) {
		seatNum = num;
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
	
	public String setSeatNumber() {
		return seatNum;
	}

	@Override
	public String toString() {
		return "Standard_Seat [seatPrice=" + seatPrice + ", seatNum=" + seatNum + "]";
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	public void setAvailable(boolean val){
		available = val;
	}
	
	
	
}
   