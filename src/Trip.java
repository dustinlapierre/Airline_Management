import java.util.ArrayList;

public class Trip {
	
	private Flight flight;
	private ArrayList<Standard_Seat> standardSeats;
	private ArrayList<VIP_Seat> vipSeats;
	
	public Flight getFlight() {
		return flight;
	}
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public void addVIPSeat(VIP_Seat seat){
		vipSeats.add(seat);
	}
	
	public void addStandardSeat(Standard_Seat seat){
		standardSeats.add(seat);
	}

	@Override
	public String toString() {
		return "Trip [flight=" + flight + ", standardSeats=" + standardSeats + ", vipSeats=" + vipSeats + "]";
	}

	
	
}
