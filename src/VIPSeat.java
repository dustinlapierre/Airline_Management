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

public class VIPSeat implements Seat {
	
	private double seatPrice;
	private String seatNum;
	private boolean available;

	
	VIPSeat(String num){
		seatNum = num;
		seatPrice = 350.27;
		available = true;
	}
	
	public double getSeatPrice() {
		return seatPrice;
	}
	
	public String getSeatNumber() {
		return seatNum;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setSeatPrice(double price) {
		seatPrice = price;
	}
	
	public void setSeatNumber(String num) {
		seatNum = num;
	}

	@Override
	public String toString() {
		return "VIP_Seat [seatPrice=" + seatPrice + ", seatNum=" + seatNum + "]";
	}
	
}
