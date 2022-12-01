package com.booking.system;

public class TicketCounter {
	
	private int availableSeats = 18;

    public synchronized void TicketBooking(String pname, int noOfSeats){
        if((availableSeats >= noOfSeats) && (noOfSeats > 0)){
            System.out.println("Hii, " + pname + " : " + noOfSeats + " Seats Booked Successfully");
            availableSeats = availableSeats - noOfSeats;
        }else{
            System.out.println("Hii, " + pname + " : " + " Seats not Available ");
        }
    }

}
