package week3;

import java.util.ArrayList;
import java.util.List;

public class Tickets {
        int tickets=5;
        List<String> bookedTickets=new ArrayList<>();
        public synchronized boolean bookingTicket(String passengerName) {
            if (tickets > 0) {
                tickets--;
                bookedTickets.add(passengerName);
                System.out.println("The passenger name is : " + passengerName);
                return true;
            } else {
                System.out.println("Sorry we are not having anymore tickets.");
                return false;
}
}
}

class BookingThread extends Thread {
    Tickets bookingSystem;
    String passengerName;

    public BookingThread(Tickets bookingSystem, String passengerName) {
        this.bookingSystem = bookingSystem;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        bookingSystem.bookingTicket(passengerName);
}
}
