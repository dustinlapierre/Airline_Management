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
import java.util.ArrayList;

public class Person {
	
	//Person class done by Nicholas Foster

	private String name;
	private ArrayList<Trip> bookedTrips = new ArrayList<Trip>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addTrip(Trip trip) {
		bookedTrips.add(trip);
	}

	public void printItinerary() {
		for(Trip t : bookedTrips)
			System.out.println(t.toString());
	}
	
}
