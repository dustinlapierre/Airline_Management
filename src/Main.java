import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Airline javaJet = new Airline();
		javaJet.setName("javaJet");
		
		Plane plane1 = new Plane("Plane 1");
		Plane plane2 = new Plane("Plane 2");
		
		javaJet.addPlane(plane1);
		javaJet.addPlane(plane2);
		
		ArrayList<Plane> planesList = javaJet.getPlanes();
		
		Person customer = new Person();
		customer.setName("Friend Guy");
		
		Flight flight1 = new Flight();
		flight1.setPlane(plane1);
		flight1.setDate("December 25, 2017");
		flight1.setDepartureLocation("New York, NY");
		flight1.setDestination("Burlington, VT");
		flight1.setTime("2:00 AM");
		
		Flight flight2 = new Flight();
		flight1.setPlane(plane2);
		flight1.setDate("November 25, 2017");
		flight1.setDepartureLocation("New York, NY");
		flight1.setDestination("Houston, TX");
		flight1.setTime("4:00 AM");
		
		Trip trip1 = new Trip();
		trip1.setFlight(flight1);
		trip1.addVIPSeat(plane1.getVIPSeat());
		
		Trip trip2 = new Trip();
		trip2.setFlight(flight2);
		trip2.addStandardSeat(plane2.getStandardSeat());
		
		customer.addTrip(trip1);
		customer.addTrip(trip2);
		
		customer.printItinerary();

	}

}
