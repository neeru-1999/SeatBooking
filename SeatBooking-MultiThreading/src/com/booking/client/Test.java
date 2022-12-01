package com.booking.client;

import com.booking.system.TicketBookingThread;
import com.booking.system.TicketCounter;

public class Test {
	
	public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();

        TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Neeru", 10);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "Mahi", 2);

        t1.start();
        t2.start();
    }

}
