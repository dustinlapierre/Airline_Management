/*
Author: Nicholas Foster & Dustin Lapierre
Class: CSI-340-01
Assignment: Airline Management
Due Date: 9/23/2017 12:00pm

Description:
This program has two functions
    -This program is designed to simulate an airline at an airport.
    It allows a customer to print out flight information for their trips

Certification of Authenticity:
I certify that this is entirely my own work, except where I have given
fully-documented references to the work of others. I understand the definition
and consequences of plagiarism and acknowledge that the assessor of this
assignment may, for the purpose of assessing this assignment:
- Reproduce this assignment and provide a copy to another member of academic
- staff; and/or Communicate a copy of this assignment to a plagiarism checking
- service (which may then retain a copy of this assignment on its database for
- the purpose of future plagiarism checking)
*/

public class Main {

	public static void main(String[] args) {
		Airline javaJet = new Airline();
		javaJet.setName("javaJet");
		
		Plane plane1 = new Plane("Plane 1");
		Plane plane2 = new Plane("Plane 2");
		
		javaJet.addPlane(plane1);
		javaJet.addPlane(plane2);
		
		Person customer = new Person();
		customer.setName("Friend Guy");
		
		Flight flight1 = new Flight(plane1);
		flight1.setDate("December 25, 2017");
		flight1.setDepartureLocation("New York, NY");
		flight1.setDestination("Burlington, VT");
		flight1.setTime("2:00 AM");
		
		Flight flight2 = new Flight(plane2);
		flight1.setDate("November 25, 2017");
		flight1.setDepartureLocation("New York, NY");
		flight1.setDestination("Houston, TX");
		flight1.setTime("4:00 AM");
		
		Trip trip1 = new Trip();
		trip1.setFlight(flight1);
		
		trip1.addVIPSeat(plane1.checkVipSeat());
		
		Trip trip2 = new Trip();
		trip2.setFlight(flight2);
		trip2.addStandardSeat(plane2.checkStandardSeat());
		
		customer.addTrip(trip1);
		customer.addTrip(trip2);
		
		customer.printItinerary();

	}

}
