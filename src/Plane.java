import java.util.ArrayList;

public class Plane {

	private String planeId; //not sure if we need this, but some way to identify plane
	private ArrayList<Standard_Seat> standardSeats;
	private ArrayList<VIP_Seat> vipSeats;
	private ArrayList<Flight> flights;
	
	public String getPlaneId() {
		return planeId;
	}

	public void setPlaneId(String planeId) {
		this.planeId = planeId;
	}

	public void addVIPSeat(VIP_Seat seat){
		vipSeats.add(seat);
	}
	
	public void addStandardSeat(Standard_Seat seat){
		standardSeats.add(seat);
	}
	
	public void addFlight(Flight flight){
		flights.add(flight);
	}
}
