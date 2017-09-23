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

public class Trip {
	
	//Trip class done by Nicholas Foster
	
	private Flight flight;
	private ArrayList<Standard_Seat> standardSeats;
	private ArrayList<VIP_Seat> vipSeats;
	
	
	Trip() {
		flight = null;
		standardSeats = new ArrayList<>();
		vipSeats = new ArrayList<>();
	}
	public Flight getFlight() {
		return flight;
	}
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public void addVIPSeat(VIP_Seat seat) {
		vipSeats.add(seat);
	}
	
	public void addStandardSeat(Standard_Seat seat) {
		standardSeats.add(seat);
	}

	@Override
	public String toString() {
		return "Trip [flight=" + flight + ", standardSeats=" + standardSeats + ", vipSeats=" + vipSeats + "]";
	}

	
	
}
