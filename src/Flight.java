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
