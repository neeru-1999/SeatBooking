package com.booking.system;

public class TicketBookingThread extends Thread {
	
	private TicketCounter ticketCounter;
    private String passengerName;
    private int noOfSeatsToBooking;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBooking) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBooking = noOfSeatsToBooking;
    }

    public void run() {
        ticketCounter.TicketBooking(passengerName, noOfSeatsToBooking);
    }

}
