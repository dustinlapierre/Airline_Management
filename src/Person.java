import java.util.ArrayList;

public class Person {

	private String name;
	private ArrayList<Trip> bookedTrips = new ArrayList<Trip>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addTrip(Trip trip){
		bookedTrips.add(trip);
	}

	public void printItinerary(){
		for(Trip t : bookedTrips)
			System.out.println(t.toString());
	}
	
}
