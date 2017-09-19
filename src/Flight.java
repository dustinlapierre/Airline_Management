
public class Flight {
	
	private Plane plane;
	private String date;
	private String departureLocation;
	private String destination;
	private String time;
	
	
	Flight(Plane p){
		plane = p;
		date = "";
		departureLocation = "";
		destination ="";
		time = "";
		
	}
	public Plane getPlane() {
		return plane;
	}
	
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDepartureLocation() {
		return departureLocation;
	}
	
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Flight [plane=" + plane.getPlaneId() + ", date=" + date + ", departureLocation=" + departureLocation
				+ ", destination=" + destination + ", time=" + time + "]";
	}
	
	

}
