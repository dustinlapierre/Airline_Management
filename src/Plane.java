import java.util.ArrayList;

public class Plane {

	private String planeId; //not sure if we need this, but some way to identify plane
	private boolean[] standardSeats;
	private boolean[] vipSeats;
	private ArrayList<Flight> flights;
	public int vipSeatCount = 10;
	public int standardSeatCount = 50;
	
	Plane(String id){
		standardSeats = new boolean[standardSeatCount];
		vipSeats = new boolean[vipSeatCount];
	}
	public String getPlaneId() {
		return planeId;
	}

	public void setPlaneId(String planeId) {
		this.planeId = planeId;
	}

	public int checkVipSeat() {
		for(int i = 0; i < vipSeatCount; i++)
			if(!vipSeats[i])
				return i;
		
		return -1;	
	}
	
	public int checkStandardSeat(){
		for(int i = 0; i < standardSeatCount; i++)
			if(!standardSeats[i])
				return i;
		
		return -1;	
	}
	
	public void addFlight(Flight flight){
		flights.add(flight);
	}
}
