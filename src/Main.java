public class Main {

	public static void main(String[] args) {
		Airline javaJet = new Airline();
		javaJet.setName("javaJet");
		
		Plane plane1 = new Plane();
		plane1.setPlaneId("Plane 1");
		Plane plane2 = new Plane();
		plane1.setPlaneId("Plane 2");
		
		javaJet.addPlane(plane1);
		javaJet.addPlane(plane2);
		
		Standard_Seat seat1 = new Standard_Seat();
		seat1.setSeatNumber("1A");
		seat1.setSeatPrice(50.00);
		seat1.setAvailability(true);
		
		Standard_Seat seat2 = new Standard_Seat();
		seat1.setSeatNumber("1A");
		seat1.setSeatPrice(50.00);
		seat1.setAvailability(true);
		
		VIP_Seat vseat1 = new VIP_Seat();
		seat1.setSeatNumber("2A");
		seat1.setSeatPrice(300.00);
		seat1.setAvailability(true);
		
		VIP_Seat vseat2 = new VIP_Seat();
		seat1.setSeatNumber("2A");
		seat1.setSeatPrice(300.00);
		seat1.setAvailability(true);
		
		plane1.addStandardSeat(seat1);
		plane1.addVIPSeat(vseat1);
		plane2.addStandardSeat(seat2);
		plane2.addVIPSeat(vseat2);
		
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
		
		//todo write print itinerary code

	}

}
