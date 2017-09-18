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
	
	//this functionality should maybe exist elsewhere design wise
	public Standard_Seat getStandardSeat(){
		//todo write a loop that checks seat availability of all standard seats on plane and returns first available
		standardSeats.get(0).setAvailability(false);
		return standardSeats.get(0);
	}
	
	public VIP_Seat getVIPSeat(){
		//todo write a loop that checks seat availability of all vip seats on plane and returns first available
		vipSeats.get(0).setAvailability(false);
		return vipSeats.get(0);
	}
}
