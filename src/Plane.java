import java.util.ArrayList;
import java.util.Arrays;

public class Plane {

	private String planeId; //not sure if we need this, but some way to identify plane
	private boolean[] standardSeats;
	private boolean[] vipSeats;
	private ArrayList<Flight> flights;
	public int vipSeatCount = 10;
	public int standardSeatCount = 50;
	
	Plane(String id){
		planeId = id;
		standardSeats = new boolean[standardSeatCount];
		vipSeats = new boolean[vipSeatCount];
		//flights.add(new Flight(this));
	}
	public String getPlaneId() {
		return planeId;
	}

	public void setPlaneId(String planeId) {
		this.planeId = planeId;
	}

	public VIP_Seat checkVipSeat() {
		for(int i = 0; i < vipSeatCount; i++)
			if(!vipSeats[i]) {
				vipSeats[i] = true;
				return new VIP_Seat(Integer.toString(i+1));
			}
				
		
		return new VIP_Seat("No Seat Available");
	}
	
	public Standard_Seat checkStandardSeat(){
		for(int i = 0; i < standardSeatCount; i++)
			if(!standardSeats[i]) {
				standardSeats[i] = true;
				return new Standard_Seat(Integer.toString(i+1));
			}
		
		return new Standard_Seat("No seat available");	
	}
	
	public void addFlight(Flight flight){
		flights.add(flight);
	}
	@Override
	public String toString() {
		return "Plane [planeId=" + planeId + ", standardSeats=" + Arrays.toString(standardSeats) + ", vipSeats="
				+ Arrays.toString(vipSeats) + ", flights=" + flights + ", vipSeatCount=" + vipSeatCount
				+ ", standardSeatCount=" + standardSeatCount + "]";
	}
	
	
}
