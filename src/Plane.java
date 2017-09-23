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
public class Plane {
	
	//Plane class done by Nicholas Foster

	private String planeId; //not sure if we need this, but some way to identify plane
	private ArrayList<Standard_Seat> standardSeats;
	private ArrayList<VIP_Seat> vipSeats;
	private ArrayList<Flight> flights;
	public int vipSeatCount = 10;
	public int standardSeatCount = 20;
	
	Plane(String id) {
		planeId = id;
		standardSeats = new ArrayList<>();
		for(int i = 0; i < standardSeatCount; i++)
			standardSeats.add(new Standard_Seat("S" + i));
		
		vipSeats = new ArrayList<>();
		for(int i = 0; i < vipSeatCount; i++)
			vipSeats.add(new VIP_Seat("V" + i));
	}
	public String getPlaneId() {
		return planeId;
	}

	public void setPlaneId(String planeId) {
		this.planeId = planeId;
	}

	public VIP_Seat checkVipSeat() {
		for(int i = 0; i < vipSeatCount; i++)
			if(vipSeats.get(i).isAvailable()) {
				vipSeats.get(i).setAvailable(false);
				return vipSeats.get(i);
			}
				
		
		return new VIP_Seat("No Seat Available");
	}
	
	public Standard_Seat checkStandardSeat() {
		for(int i = 0; i < standardSeatCount; i++)
			if(standardSeats.get(i).isAvailable()) {
				standardSeats.get(i).setAvailable(false);
				return standardSeats.get(i);
			}
		
		return new Standard_Seat("No seat available");	
	}
	
	public void addFlight(Flight flight) {
		flights.add(flight);
	}
	
	public int getCapacity() {
		return standardSeatCount + vipSeatCount;
	}
	
	@Override
	public String toString() {
		return "Plane [planeId=" + planeId + ", standardSeats=" + standardSeats + ", vipSeats=" + vipSeats
				+ ", flights=" + flights + "]";
	}
	
	
	
}
